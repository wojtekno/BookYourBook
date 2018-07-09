package com.example.wojtek.bookyourbook.data;

import android.provider.BaseColumns;

public class InventoryContract {

    private InventoryContract() {
    }

    public static class BookEntry implements BaseColumns {
        public static final String TABLE_NAME = "books";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_BOOK_PRODUCT_NAME = "product name";
        public static final String COLUMN_BOOK_PRICE = "price";
        public static final String COLUMN_BOOK_QUANTITY = "quantity";
        public static final String COLUMN_BOOK_SUPPLIER_NAME = "supplier name";
        public static final String COLUMN_BOOK_SUPPLIER_PHONE_NUMBER = "supplier phone number";
    }


}
