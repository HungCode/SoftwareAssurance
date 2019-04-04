package com.hung.test;


import com.hung.controllers.XuatBaoCao;
import com.hung.daos.ThongKe_DAO;
import com.hung.entities.LichSuDongBHXH;
import com.hung.entities.NguoiDongBHXH;
import com.hung.entities.NguoiDongBH_LichSu;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class TestXuatBaoCao {
    public static XuatBaoCao xbc = new XuatBaoCao();


    public static void main(String[] args) throws IOException {
     xbc.danhsachthamgiabhxh();
     xbc.lichsudongbhxh("123456");
    }
}
