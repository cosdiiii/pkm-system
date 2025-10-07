package com.zhangjiayi.pkm.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NoteTest {
    private Note note;
    private Tag tag;

    @BeforeEach
    void setUp() {
        note = new Note("Test Title", "Test Content");
        tag = new Tag("Important");
    }

    @Test
    void testNoteCreation() {
        assertNotNull(note.getCreatedAt());
        assertNotNull(note.getUpdatedAt());
        assertEquals("Test Title", note.getTitle());
        assertEquals("Test Content", note.getContent());
    }

    @Test
    void testAddTag() {
        note.addTag(tag);
        assertTrue(note.getTags().contains(tag));
        assertEquals(1, note.getTags().size());
    }

    @Test
    void testRemoveTag() {
        note.addTag(tag);
        note.removeTag(tag);
        assertFalse(note.getTags().contains(tag));
        assertEquals(0, note.getTags().size());
    }

    @Test
    void testInheritance() {
        TextNote textNote = new TextNote("Inheritance", "Testing inheritance");
        assertTrue(textNote instanceof Note);
        assertEquals("Inheritance", textNote.getTitle());
    }

    @Test
    void testTextNoteSummary() {
        TextNote textNote = new TextNote("Summary Test", "Content", "This is a summary");
        assertEquals("This is a summary", textNote.getSummary());

        textNote.setSummary("New summary");
        assertEquals("New summary", textNote.getSummary());
    }
}
