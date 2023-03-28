package domain.usecase

import domain.model.Note
import domain.repository.NoteRepository
import domain.utils.ResultStatus
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllNoteUseCase@Inject constructor(private val noteRepository: NoteRepository) {
   operator fun invoke() : Flow<ResultStatus<List<Note>>>{
        return noteRepository.getAllNotes()
    }

}