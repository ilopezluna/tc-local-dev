package com.example.tclocaldev.events;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
public record NoteCreated(Long noteId) implements NoteEvent {}
