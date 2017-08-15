package com.huang.creator.domain;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huang_jiangling on 2017/8/14.
 */
public class DomainCreator {

    private DomainCreator() {
    }

    private Workbook workBook;
    private Sheet sheet;
    private List<String> columnList = new ArrayList<>();
    private List<String> columnCommentList = new ArrayList<>();
    private List<String> columnTypeList = new ArrayList<>();

    public static DomainCreator newCreator(String excelFilePath) {
        return newCreator(excelFilePath, null);
    }

    public static DomainCreator newCreator(String excelFilePath, String sheetName) {

        try (Workbook workBook = WorkbookFactory.create(new FileInputStream(new File(excelFilePath)))) {

            DomainCreator domainCreator = new DomainCreator();
            domainCreator.workBook = workBook;

            Sheet sheet = StringUtils.isNotBlank(sheetName) ? workBook.getSheet(sheetName) : workBook.getSheetAt(0);
            domainCreator.sheet = sheet;

            return domainCreator;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readTable(DomainCreator domainCreator) {
        Sheet sheet = domainCreator.sheet;
        int firstRowNum = sheet.getFirstRowNum();
        int lastRowNum = sheet.getLastRowNum();
        for (int i = firstRowNum; i <= lastRowNum; i++) {

        }
    }

}
