package com.zhangjiayi.pkm.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TagTest {
    @Test
    void testTagCreation() {
        Tag tag = new Tag("Test Tag");
        assertEquals("Test Tag", tag.getName());
    }

    @Test
    void testTagEquals() {
        Tag tag1 = new Tag("Test");
        tag1.setId(1L);
        Tag tag2 = new Tag("Test");
        tag2.setId(1L);

        assertEquals(tag1, tag2);
    }

    @Test
    void testTagNotEquals() {
        Tag tag1 = new Tag("Test1");
        tag1.setId(1L);
        Tag tag2 = new Tag("Test2");
        tag2.setId(2L);

        assertNotEquals(tag1, tag2);
    }
}