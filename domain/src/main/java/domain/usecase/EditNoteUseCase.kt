package domain.usecase

import domain.model.Note
import domain.repository.NoteRepository
import javax.inject.Inject

class EditNoteUseCase@Inject constructor(private val noteRepository: NoteRepository) {
    operator fun invoke(note: Note) = noteRepository.editNote(note)

}