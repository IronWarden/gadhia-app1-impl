/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rishi Gadhia
 */

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FXMLControllerTest {

    @Test
    void test_clearAllItems() {
        FXMLController fxmlController = new FXMLController();
        fxmlController.list.add(new ListObject("a", LocalDate.MIN));
        fxmlController.clearAllItems();

        assertFalse(fxmlController.list.contains(new ListObject("a", LocalDate.MIN)));
    }
}