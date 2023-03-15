package com.example.tclocaldev.events;

import lombok.extern.jackson.Jacksonized;

@Jacksonized
public record Unknown(Long noteId) implements NoteEvent {}
