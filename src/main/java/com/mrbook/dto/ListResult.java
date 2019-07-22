package com.mrbook.dto;

import com.mrbook.entity.Record;

import java.util.List;

public class ListResult {
    private int pages;
    private List<Record> records;

    public ListResult(int pages, List<Record> records) {
        this.pages = pages;
        this.records = records;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
