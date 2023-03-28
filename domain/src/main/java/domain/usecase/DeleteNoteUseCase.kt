package domain.usecase

import domain.model.Note
import domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase@Inject constructor(private val noteRepository: NoteRepository) {
    operator fun invoke(note: Note) = noteRepository.delete(note)

}