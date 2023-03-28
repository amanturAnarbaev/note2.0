package domain.usecase

import domain.model.Note
import domain.repository.NoteRepository
import javax.inject.Inject

class CreateNoteUseCase@Inject constructor(private val noteRepository: NoteRepository) {
    operator fun invoke(note: Note) = noteRepository.createNote(note)

}