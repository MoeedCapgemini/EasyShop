package com.example.cleanarcitecturee1.domain.use_cases

import com.example.cleanarcitecturee1.domain.model.Note
import com.example.cleanarcitecturee1.domain.repository.NotesRepository
import javax.inject.Inject

class UpdateUseCase @Inject constructor(private val notesRepository: NotesRepository) {
    suspend operator fun invoke(note: Note) = notesRepository.update(note)
}