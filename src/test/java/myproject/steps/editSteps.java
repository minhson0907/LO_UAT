package myproject.steps;

import com.tigervnc.rdr.Exception;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import myproject.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class editSteps extends TestBase {

    @And("^I edit information in Thông tin chủ thẻ chính as below$")
    public void iEditInformationInThôngTinChủThẻChínhAsBelow(DataTable contactInfo) throws Throwable {
        List<List<String>> data = contactInfo.raw();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'HeThongDungChung')]")));
        Select trinhdohocvan = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_TrinhDoHocVan')]")));
        trinhdohocvan.selectByVisibleText(data.get(0).get(0));
        Select tinhtranghonnhan = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_TinhTrangHonNhan')]")));
        tinhtranghonnhan.selectByVisibleText(data.get(0).get(1));
        Select tinhtrangcutru = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_TinhTrangNoiCuTru')]")));
        tinhtrangcutru.selectByVisibleText(data.get(0).get(2));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_ThoiGianCuTru_Nam')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_ThoiGianCuTru_Nam')]")).sendKeys(data.get(0).get(3));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_ThoiGianCuTru_Thang')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_ThoiGianCuTru_Thang')]")).sendKeys(data.get(0).get(4));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_MatKhauXacThucKH')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_MatKhauXacThucKH')]")).sendKeys(data.get(0).get(5));
        Select noicap = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_NoiCap')]")));
        noicap.selectByVisibleText(data.get(0).get(6));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_SoNguoiPhuThuoc')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_SoNguoiPhuThuoc')]")).sendKeys(data.get(0).get(7));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_DienThoaiDiDong')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_DienThoaiDiDong')]")).sendKeys(data.get(0).get(17));
        Select hokhauchinhchu = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_HoKhau_TinhThanh')]")));
        hokhauchinhchu.selectByVisibleText(data.get(0).get(8));
        Thread.sleep(1000);
        Select quanhuyenchinhchu = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_HoKhau_QuanHuyen')]")));
        quanhuyenchinhchu.selectByVisibleText(data.get(0).get(9));
        Thread.sleep(1000);
        Select phuongxachinhchu = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_HoKhau_PhuongXa')]")));
        phuongxachinhchu.selectByVisibleText(data.get(0).get(10));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_HoKhau_SoNhaTenDuong')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_HoKhau_SoNhaTenDuong')]")).sendKeys(data.get(0).get(11));
        Select hokhautinhthanh = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_CuTru_TinhThanh')]")));
        hokhautinhthanh.selectByVisibleText(data.get(0).get(12));
        Thread.sleep(1000);
        Select hokhauquanhuyen = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_CuTru_QuanHuyen')]")));
        hokhauquanhuyen.selectByVisibleText(data.get(0).get(13));
        Thread.sleep(1000);
        Select hokhauphuongxa = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_CuTru_PhuongXa')]")));
        hokhauphuongxa.selectByVisibleText(data.get(0).get(14));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_CuTru_SoNhaTenDuong')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_CuTru_SoNhaTenDuong')]")).sendKeys(data.get(0).get(15));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_Email')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_Email')]")).sendKeys(data.get(0).get(16));
    }

    @And("^I edit information in Thông tin nghề nghiệp as below$")
    public void iEditInformationInThôngTinNghềNghiệpAsBelow(DataTable contactInfo) throws Throwable {
        List<List<String>> data = contactInfo.raw();
        Select nghenghiepchucvu = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_ChucVu')]")));
        nghenghiepchucvu.selectByVisibleText(data.get(0).get(0));
        Select nghenghieptinhtranglamviec = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_TinhTrangLamViec')]")));
        nghenghieptinhtranglamviec.selectByVisibleText(data.get(0).get(1));
        driver.findElement(By.xpath("//input[contains(@id,'NgheNghiep_TenDoanhNghiep')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'NgheNghiep_TenDoanhNghiep')]")).sendKeys(data.get(0).get(2));
        Select nhomdoanhnghiep = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_NhomDoanhNghiep')]")));
        nhomdoanhnghiep.selectByVisibleText(data.get(0).get(3));
        Select loaihinhdoanhnghiep = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_LoaiHinhDoanhNghiep')]")));
        loaihinhdoanhnghiep.selectByVisibleText(data.get(0).get(4));
        driver.findElement(By.xpath("//input[contains(@id,'NgheNghiep_DienThoai')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'NgheNghiep_DienThoai')]")).sendKeys(data.get(0).get(5));
        driver.findElement(By.xpath("//input[contains(@id,'NgheNghiep_DienThoai_SoNhanh')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'NgheNghiep_DienThoai_SoNhanh')]")).sendKeys(data.get(0).get(6));
        Select nghenghieptinhthanhpho = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_TinhThanhPho')]")));
        nghenghieptinhthanhpho.selectByVisibleText(data.get(0).get(7));
        Thread.sleep(1000);
        Select nghenghiepquanhuyen = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_QuanHuyen')]")));
        nghenghiepquanhuyen.selectByVisibleText(data.get(0).get(8));
        Thread.sleep(1000);
        Select nghenghiepphuongxa = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_PhuongXa')]")));
        nghenghiepphuongxa.selectByVisibleText(data.get(0).get(9));
    }

    @And("^I edit information in Thông tin tài chính as below$")
    public void iEditInformationInThôngTinTàiChínhAsBelow(DataTable contactInfo) throws Exception {
        List<List<String>> data = contactInfo.raw();
        Select hinhthucnhanluong = new Select(driver.findElement(By.xpath("//select[contains(@id,'TaiChinh_HinhThucNhanLuong')]")));
        hinhthucnhanluong.selectByVisibleText(data.get(0).get(0));
        Select cic12 = new Select(driver.findElement(By.xpath("//select[contains(@id,'TaiChinh_CIC_12')]")));
        cic12.selectByVisibleText(data.get(0).get(1));
        Select cic24 = new Select(driver.findElement(By.xpath("//select[contains(@id,'TaiChinh_CIC_24')]")));
        cic24.selectByVisibleText(data.get(0).get(2));
        Select cic36 = new Select(driver.findElement(By.xpath("//select[contains(@id,'TaiChinh_CIC_36')]")));
        cic36.selectByVisibleText(data.get(0).get(3));
        Select ctchientai = new Select(driver.findElement(By.xpath("//select[contains(@id,'TaiChinh_CIC_HienTai')]")));
        ctchientai.selectByVisibleText(data.get(0).get(4));
        driver.findElement(By.xpath("//input[contains(@id,'TaiChinh_ChiPhiHangThang')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'TaiChinh_ChiPhiHangThang')]")).sendKeys(data.get(0).get(5));
        driver.findElement(By.xpath("//input[contains(@id,'TaiChinh_LuongHangThang')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'TaiChinh_LuongHangThang')]")).sendKeys(data.get(0).get(6));
    }

    @And("^I edit information in Thông tin tham chiếu as below$")
    public void iEditInformationInThôngTinThamChiếuAsBelow(DataTable contactInfo) {
        List<List<String>> data = contactInfo.raw();
        Select quanhevoichuthe = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamChieu_1_QuanheVoiChuThe')]")));
        quanhevoichuthe.selectByVisibleText(data.get(0).get(0));
        driver.findElement(By.xpath("//input[contains(@id,'ThamChieu_1_HoVaTen')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ThamChieu_1_HoVaTen')]")).sendKeys(data.get(0).get(1));
        driver.findElement(By.xpath("//input[contains(@id,'ThamChieu_1_DTDD')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ThamChieu_1_DTDD')]")).sendKeys(data.get(0).get(2));
        driver.findElement(By.xpath("//input[contains(@id,'ThamChieu_2_DTDD')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ThamChieu_2_DTDD')]")).sendKeys(data.get(0).get(2));
    }

    @And("^I edit information in Đơn vị tiếp nhận hồ sơ as below$")
    public void iEditInformationInĐơnVịTiếpNhậnHồSơAsBelow(DataTable contactInfo) throws Exception {
        List<List<String>> data = contactInfo.raw();
        Select chuongtrinhtiepthi = new Select(driver.findElement(By.xpath("//select[contains(@id,'DonViTiepNhan_ChuongTrinhTiepThi')]")));
        chuongtrinhtiepthi.selectByVisibleText(data.get(0).get(0));
        driver.findElement(By.xpath("//input[contains(@id,'DonViTiepNhan_MaNVHDBANK')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'DonViTiepNhan_MaNVHDBANK')]")).sendKeys(data.get(0).get(1));
        clickToElementByJS("//button[@id='btnMaNvHDBAnk']");
        driver.findElement(By.xpath("//input[contains(@id,'DonViTiepNhan_MaSoNguoiGioiThieu')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'DonViTiepNhan_MaSoNguoiGioiThieu')]")).sendKeys(data.get(0).get(2));
        clickToElementByJS("//button[@id='btnSearchMaGioiThieu']");
    }

    @And("^I edit information in Thông tin thẻ tín dụng$")
    public void iEditInformationInThôngTinThẻTínDụng(DataTable contactInfo) throws Throwable {
        List<List<String>> data = contactInfo.raw();
        Select diachinhanthe = new Select(driver.findElement(By.xpath("//select[contains(@id,'TheTinDung_DiaChiNhanThe')]")));
        diachinhanthe.selectByVisibleText(data.get(0).get(0));
        Select hinhthucguisaoke = new Select(driver.findElement(By.xpath("//select[contains(@id,'TheTinDung_HinhThuGuiSaoKe')]")));
        hinhthucguisaoke.selectByVisibleText(data.get(0).get(2));
        Select chinhsach = new Select(driver.findElement(By.xpath("//select[contains(@id,'TheTinDung_ChinhSach')]")));
        chinhsach.selectByVisibleText(data.get(0).get(3));
        Select diachinhansaoke = new Select(driver.findElement(By.xpath("//select[contains(@id,'TheTinDung_DiaChiNhanSaoKe')]")));
        diachinhansaoke.selectByVisibleText(data.get(0).get(4));
        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_DichVuSMS')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_DichVuSMS')]")).sendKeys(data.get(0).get(5));
        Select sanphamthe = new Select(driver.findElement(By.xpath("//select[contains(@id,'TheTinDung_SanPhamThe')]")));
        sanphamthe.selectByVisibleText(data.get(0).get(6));
        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_DoiTuongKH')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_DoiTuongKH')]")).sendKeys(data.get(0).get(7));
        waitElement(By.xpath("//tr[contains(@data-id,'" + data.get(0).get(7) + "')]"));
        driver.findElement(By.xpath("//tr[contains(@data-id,'" + data.get(0).get(7) + "')]")).click();
        Select trichnotudongthe = new Select(driver.findElement(By.xpath("//select[contains(@id,'TheTinDung_TrichNoTuDongThe')]")));
        trichnotudongthe.selectByVisibleText(data.get(0).get(8));
        if (data.get(0).get(3).equals("Thu phí thường niên")) {
            System.out.println("Nothing");
        } else {
            driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_ThoiGianApDung')]")).clear();
            driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_ThoiGianApDung')]")).sendKeys(data.get(0).get(9));
        }
//        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_HoTen')]")).clear();
//        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_HoTen')]")).sendKeys(data.get(0).get(8));
//        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_CMND')]")).clear();
//        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_CMND')]")).sendKeys(data.get(0).get(9));
//        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_SoDTDD')]")).clear();
//        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_SoDTDD')]")).sendKeys(data.get(0).get(10));
//        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_ThoiGianApDung')]")).clear();
//        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_ThoiGianApDung')]")).sendKeys(data.get(0).get(11));
    }

    @And("^I edit information in Thông tin thẩm định as below$")
    public void iEditInformationInThôngTinThẩmĐịnhAsBelow(DataTable contactInfo) throws Exception {
        List<List<String>> data = contactInfo.raw();
        Select thamdinhthucte = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_ThamDinhThucTe')]")));
        thamdinhthucte.selectByVisibleText(data.get(0).get(0));
        driver.findElement(By.xpath("//input[contains(@id,'ThamDinh_HanMucTinDungChoThe_DVKD')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ThamDinh_HanMucTinDungChoThe_DVKD')]")).sendKeys(data.get(0).get(1));
    }

    @And("^I edit information at Thông tin thẩm định as below$")
    public void iEditInformationAtThôngTinThẩmĐịnhAsBelow(DataTable contactInfo) throws Throwable {
        List<List<String>> data = contactInfo.raw();
        Select thamdinhthucte = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_ThamDinhThucTe')]")));
        thamdinhthucte.selectByVisibleText(data.get(0).get(0));
        driver.findElement(By.xpath("//input[contains(@id,'ThamDinh_HanMucTinDungChoThe_HoiSo')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ThamDinh_HanMucTinDungChoThe_HoiSo')]")).sendKeys(data.get(0).get(1));
        Select dexuathoiso = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_DeXuat_HoiSo')]")));
        dexuathoiso.selectByVisibleText(data.get(0).get(2));
        Thread.sleep(1000);
        Select madexuathoiso = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_MaDeXuat_HoiSo')]")));
        madexuathoiso.selectByVisibleText(data.get(0).get(3));

    }

    @And("^I edit information in Thông tin phê duyệt as below$")
    public void iEditInformationInThôngTinPhêDuyệtAsBelow(DataTable contactInfo) throws Throwable {
        List<List<String>> data = contactInfo.raw();
        Select cappheduyet = new Select(driver.findElement(By.xpath("//select[contains(@id,'PheDuyet_CapPheDuyet')]")));
        cappheduyet.selectByVisibleText(data.get(0).get(0));
        if (data.get(0).get(1).equals("A1") | data.get(0).get(1).equals("A5") | data.get(0).get(1).equals("A3")) {
        } else {
            driver.findElement(By.xpath("//input[contains(@id,'PheDuyet_HanMucChoThe')]")).clear();
            driver.findElement(By.xpath("//input[contains(@id,'PheDuyet_HanMucChoThe')]")).sendKeys(data.get(0).get(2));
        }
        if (data.get(0).get(3).equals("Đồng ý")) {
            clickToElementByJS("//input[contains(@id,'rbPheDuyet_DongY')]");
//            driver.findElement(By.xpath("//input[contains(@id,'rbPheDuyet_DongY')]")).click();
        } else if (data.get(0).get(3).equals("Đồng ý với điều kiện")) {
            clickToElementByJS("//input[contains(@id,'rbPheDuyet_DongYVoiDK')]");
//            driver.findElement(By.xpath("//input[contains(@id,'rbPheDuyet_DongYVoiDK')]")).click();
            driver.findElement(By.xpath("//input[contains(@id,'tbPheDuyet_DieuKienPheDuyet')]")).clear();
            driver.findElement(By.xpath("//input[contains(@id,'tbPheDuyet_DieuKienPheDuyet')]")).sendKeys("QC TEST");
        } else {
            clickToElementByJS("//input[contains(@id,'rbPheDuyet_TuChoi')]");
//            driver.findElement(By.xpath("//input[contains(@id,'rbPheDuyet_TuChoi')]")).click();
        }
    }

    @And("^I edit information in Thông tin hồ sơ as below$")
    public void iEditInformationInThôngTinHồSơAsBelow(DataTable contactInfo) {
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'HeThongDungChung')]")));
        List<List<String>> data = contactInfo.raw();
        Select donvikinhdoanh = new Select(driver.findElement(By.xpath("//select[contains(@id,'HoSo_DVKD')]")));
        donvikinhdoanh.selectByVisibleText(data.get(0).get(1));
        Select loaihoso = new Select(driver.findElement(By.xpath("//select[contains(@id,'HoSo_LoaiHoSo')]")));
        loaihoso.selectByVisibleText(data.get(0).get(0));
    }
}
