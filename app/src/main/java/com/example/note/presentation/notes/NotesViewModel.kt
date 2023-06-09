package com.example.note.presentation.notes

import com.example.note.data.base.BaseViewModel
import com.example.note.domain.model.Note
import com.example.note.domain.usecase.DeleteNoteUseCase
import com.example.note.domain.usecase.GetAllNoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val getAllNoteUseCase: GetAllNoteUseCase,
    private val deleteNoteUseCase: DeleteNoteUseCase,

    ) : BaseViewModel() {
    private val _noteState = MutableStateFlow<UiState<List<Note>>>(UiState.Empty())
    val noteState = _noteState.asStateFlow()

    private val _deleteNoteState = MutableStateFlow<UiState<Unit>>(UiState.Empty())
    val deleteNoteState = _deleteNoteState.asStateFlow()

    private val _createNoteState = MutableStateFlow<UiState<Unit>>(UiState.Empty())
    val createNoteState = _createNoteState.asStateFlow()

    init {
        getAllNotes()
    }


    private fun getAllNotes() {
        getAllNoteUseCase().collectFlow(_noteState)
    }



    fun delete(position: Int, note: Note) {
        if (note.title.isNotBlank() && note.description.isNotBlank() && position != -1) {
            deleteNoteUseCase(note).collectFlow(_deleteNoteState)
        } else {
            _deleteNoteState.value = UiState.Error(msg = "you want to delete smth that does not")
        }
    }


}