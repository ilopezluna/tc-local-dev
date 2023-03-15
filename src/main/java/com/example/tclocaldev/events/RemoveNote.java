package com.example.tclocaldev.events;

import lombok.extern.jackson.Jacksonized;

@Jacksonized
public record RemoveNote(Long noteId) implements NoteEvent {}
