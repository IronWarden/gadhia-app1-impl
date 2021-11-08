/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ListObjectTest {
    @Test
    void test_if_list_object_is_created() {
        ListObject listObject = new ListObject(" a list", LocalDate.MIN);

        assertEquals(LocalDate.MIN,listObject.getDate() );
        assertEquals(" a list", listObject.getDescription());
    }

}