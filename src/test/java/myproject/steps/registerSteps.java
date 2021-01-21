package myproject.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import myproject.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class registerSteps extends TestBase {

    @Given("^I access link with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iAccessLink(String username, String pass) throws InterruptedException {
        driver.findElement(By.id("url")).sendKeys(prop.getProperty("url.api"));
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.xpath("//button[.='Add']")).click();
        driver.get(prop.getProperty("url.api"));
    }

    @When("^I click New button$")
    public void iClickNewButton() throws Exception {
        waitElement(By.xpath("//button[contains(@id,'btnThemMoi')]"));
        driver.findElement(By.xpath("//button[contains(@id,'btnThemMoi')]")).click();
    }

    @Then("^I choose \"([^\"]*)\"$")
    public void iChoose(String arg0) throws Throwable {
        waitElement(By.xpath("//span[text()='Vui lòng chọn']"));
        driver.findElement(By.xpath("//span[text()='Vui lòng chọn']")).click();
        driver.findElement(By.xpath("//li[text()='" + arg0 + "']")).click();
        driver.findElement(By.id("btnXacNhanTaoYeuCau")).click();
    }

    @And("^I fill all data in Thông Tin Hồ sơ as below$")
    public void iFillAllDataInThôngTinHồSơAsBelow(DataTable contactInfo) {
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='ms-dlgFrameContainer']/iframe")));
        List<List<String>> data = contactInfo.raw();
        Select loainghiepvu = new Select(driver.findElement(By.xpath("//select[contains(@id,'Chung_Bieumau')]")));
        loainghiepvu.selectByVisibleText(data.get(0).get(0));
        Select donvikinhdoanh = new Select(driver.findElement(By.xpath("//select[contains(@id,'HoSo_DVKD')]")));
        donvikinhdoanh.selectByVisibleText(data.get(0).get(1));
        Select loaihoso = new Select(driver.findElement(By.xpath("//select[contains(@id,'HoSo_LoaiHoSo')]")));
        loaihoso.selectByVisibleText(data.get(0).get(2));
        Select chinhsachcaptindung = new Select(driver.findElement(By.xpath("//select[contains(@id,'HoSo_ChinhSachCapTinDung')]")));
        chinhsachcaptindung.selectByVisibleText(data.get(0).get(3));
    }

    @And("^I fill all data in Thông tin chủ thẻ chính as below$")
    public void iFillAllInfoBelowAs(DataTable contactInfo) throws Exception {
        List<List<String>> data = contactInfo.raw();
        Select trinhdohocvan = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_TrinhDoHocVan')]")));
        trinhdohocvan.selectByVisibleText(data.get(0).get(0));
        Select tinhtranghonnhan = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_TinhTrangHonNhan')]")));
        tinhtranghonnhan.selectByVisibleText(data.get(0).get(1));
        Select tinhtrangcutru = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_TinhTrangNoiCuTru')]")));
        tinhtrangcutru.selectByVisibleText(data.get(0).get(2));
        Select loaigiayto = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_LoaiGiayTo')]")));
        loaigiayto.selectByVisibleText(data.get(0).get(3));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_ThoiGianCuTru_Nam')]")).sendKeys(data.get(0).get(4));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_ThoiGianCuTru_Thang')]")).sendKeys(data.get(0).get(5));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_NgayCap')]")).sendKeys(data.get(0).get(6));
        Select noicap = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_NoiCap')]")));
        noicap.selectByVisibleText(data.get(0).get(7));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_MatKhauXacThucKH')]")).sendKeys(data.get(0).get(8));
        Select gioitinh = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_GioiTinh')]")));
        gioitinh.selectByVisibleText(data.get(0).get(9));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_SoNguoiPhuThuoc')]")).sendKeys(data.get(0).get(10));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_HoTenChuThe')]")).sendKeys(data.get(0).get(11));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_TenInDapTrenThe')]")).sendKeys(data.get(0).get(12));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_Email')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_Email')]")).sendKeys(data.get(0).get(19));
        Select hokhautinhthanh = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_CuTru_TinhThanh')]")));
        hokhautinhthanh.selectByVisibleText(data.get(0).get(13));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_NgaySinh')]")).sendKeys(data.get(0).get(14));
        Select hokhauquanhuyen = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_CuTru_QuanHuyen')]")));
        hokhauquanhuyen.selectByVisibleText(data.get(0).get(15));
        Thread.sleep(1000);
        Select hokhauphuongxa = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_CuTru_PhuongXa')]")));
        hokhauphuongxa.selectByVisibleText(data.get(0).get(16));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_DienThoaiDiDong')]")).sendKeys(data.get(0).get(17));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_HoKhau_SoNhaTenDuong')]")).sendKeys(data.get(0).get(18));
        Select hokhauchinhchu = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_HoKhau_TinhThanh')]")));
        hokhauchinhchu.selectByVisibleText(data.get(0).get(20));
        Thread.sleep(1000);
        Select quanhuyenchinhchu = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_HoKhau_QuanHuyen')]")));
        quanhuyenchinhchu.selectByVisibleText(data.get(0).get(21));
        Thread.sleep(1000);
        Select phuongxachinhchu = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_HoKhau_PhuongXa')]")));
        phuongxachinhchu.selectByVisibleText(data.get(0).get(22));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_CuTru_SoNhaTenDuong')]")).sendKeys(data.get(0).get(23));
    }

    @And("^I fill all data in Thông tin nghề nghiệp as below$")
    public void iFillAllDataInThôngTinNghềNghiệpAsBelow(DataTable contactInfo) throws Exception {
        List<List<String>> data = contactInfo.raw();
        Select nghenghiepchucvu = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_ChucVu')]")));
        nghenghiepchucvu.selectByVisibleText(data.get(0).get(0));
        Select nghenghieptinhtranglamviec = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_TinhTrangLamViec')]")));
        nghenghieptinhtranglamviec.selectByVisibleText(data.get(0).get(1));
        driver.findElement(By.xpath("//input[contains(@id,'NgheNghiep_TenDoanhNghiep')]")).sendKeys(data.get(0).get(2));
        Select nhomdoanhnghiep = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_NhomDoanhNghiep')]")));
        nhomdoanhnghiep.selectByVisibleText(data.get(0).get(3));
        Select loaihinhdoanhnghiep = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_LoaiHinhDoanhNghiep')]")));
        loaihinhdoanhnghiep.selectByVisibleText(data.get(0).get(4));
        driver.findElement(By.xpath("//input[contains(@id,'NgheNghiep_DienThoai')]")).sendKeys(data.get(0).get(5));
        driver.findElement(By.xpath("//input[contains(@id,'NgheNghiep_DienThoai_SoNhanh')]")).sendKeys(data.get(0).get(6));
        Select nghenghieptinhthanhpho = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_TinhThanhPho')]")));
        nghenghieptinhthanhpho.selectByVisibleText(data.get(0).get(7));
        Thread.sleep(1000);
        Select nghenghiepquanhuyen = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_QuanHuyen')]")));
        nghenghiepquanhuyen.selectByVisibleText(data.get(0).get(8));
        Thread.sleep(1000);
        Select nghenghiepphuongxa = new Select(driver.findElement(By.xpath("//select[contains(@id,'NgheNghiep_PhuongXa')]")));
        nghenghiepphuongxa.selectByVisibleText(data.get(0).get(9));
        driver.findElement(By.xpath("//input[contains(@id,'NgheNghiep_SoNhaTenDuong')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'NgheNghiep_SoNhaTenDuong')]")).sendKeys(data.get(0).get(10));
    }

    @And("^I fill all data in Thông tin tài chính as below$")
    public void iFillAllDataInThôngTinTàiChínhAsBelow(DataTable contactInfo) {
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
        driver.findElement(By.xpath("//input[contains(@id,'TaiChinh_ChiPhiHangThang')]")).sendKeys(data.get(0).get(5));
        driver.findElement(By.xpath("//input[contains(@id,'TaiChinh_LuongHangThang')]")).sendKeys(data.get(0).get(6));
    }

    @And("^I fill all data in Thông tin tham chiếu as below$")
    public void iFillAllDataInThôngTinThamChiếuAsBelow(DataTable contactInfo) {
        List<List<String>> data = contactInfo.raw();
        Select quanhevoichuthe = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamChieu_1_QuanheVoiChuThe')]")));
        quanhevoichuthe.selectByVisibleText(data.get(0).get(0));
        driver.findElement(By.xpath("//input[contains(@id,'ThamChieu_1_HoVaTen')]")).sendKeys(data.get(0).get(1));
        driver.findElement(By.xpath("//input[contains(@id,'ThamChieu_1_DTDD')]")).sendKeys(data.get(0).get(2));
        driver.findElement(By.xpath("//input[contains(@id,'ThamChieu_2_DTDD')]")).sendKeys(data.get(0).get(2));
    }

    @And("^I fill all data in Thông tin thẻ tín dụng$")
    public void iFillAllDataInThôngTinThẻTínDụng(DataTable contactInfo) throws Exception {
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
        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_DoiTuongKH')]")).sendKeys(data.get(0).get(1));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//tr[contains(@data-id,'" + data.get(0).get(1) + "')]")).click();
        Select trichnotudongthe = new Select(driver.findElement(By.xpath("//select[contains(@id,'TheTinDung_TrichNoTuDongThe')]")));
        trichnotudongthe.selectByVisibleText(data.get(0).get(7));
        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_HoTen')]")).sendKeys(data.get(0).get(8));
        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_CMND')]")).sendKeys(data.get(0).get(9));
        driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_SoDTDD')]")).sendKeys(data.get(0).get(10));
        if (data.get(0).get(3).equals("Thu phí thường niên")) {
            System.out.println("Nothing");
        } else {
            driver.findElement(By.xpath("//input[contains(@id,'TheTinDung_ThoiGianApDung')]")).sendKeys(data.get(0).get(11));
        }
    }

    @And("^I fill all data in Thông tin thẩm định as below$")
    public void iFillAllDataInThôngTinThẩmĐịnhAsBelow(DataTable contactInfo) {
        List<List<String>> data = contactInfo.raw();
        Select thamdinhthucte = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_ThamDinhThucTe')]")));
        thamdinhthucte.selectByVisibleText(data.get(0).get(0));
        Select manhomkhcaptindung = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_MaNhomKHCapTinDung')]")));
        manhomkhcaptindung.selectByVisibleText(data.get(0).get(1));
        Select dexuathoiso = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_DeXuat_HoiSo')]")));
        dexuathoiso.selectByVisibleText(data.get(0).get(2));
        Select madexuathoiso = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_MaDeXuat_HoiSo')]")));
        madexuathoiso.selectByVisibleText(data.get(0).get(3));
        driver.findElement(By.xpath("//input[contains(@id,'ThamDinh_HanMucTinDungChoThe_HoiSo')]")).sendKeys(data.get(0).get(4));
    }

    @And("^I fill all data in Thông tin phê duyệt as below$")
    public void iFillAllDataInThôngTinPhêDuyệtAsBelow(DataTable contactInfo) {
        List<List<String>> data = contactInfo.raw();
        Select cappheduyet = new Select(driver.findElement(By.xpath("//select[contains(@id,'PheDuyet_CapPheDuyet')]")));
        cappheduyet.selectByVisibleText(data.get(0).get(0));
//        driver.findElement(By.xpath("//input[contains(@id,'PheDuyet_HanMucChoThe')]")).sendKeys(data.get(0).get(1));
    }

    @Then("^I save all information$")
    public void iSaveAllInformation() throws Exception {
        driver.findElement(By.xpath("//input[contains(@id,'btnSave')]")).click();
        Thread.sleep(2000);
    }

    @And("^I verify \"([^\"]*)\" \"([^\"]*)\" is displayed in Quản lý yêu cầu table$")
    public void iVerifyIsDisplayedInQuảnLýYêuCầuTable(String text1, String text2) throws Throwable {
        waitElement(By.xpath("//table[@class='table table-hover table-bordered']"));
        String actualString = driver.findElement(By.xpath("//table[@class='table table-hover table-bordered']")).getText();
        System.out.println("**************** Data table" + actualString);
        assertTrue(actualString.contains(text1));
        assertTrue(actualString.contains(text2));
    }

    @And("^I fill all data in Thông tin chủ thẻ chính with cif as below$")
    public void iFillAllDataInThôngTinChủThẻChínhWithCifAsBelow(DataTable contactInfo) throws Exception {
        List<List<String>> data = contactInfo.raw();
        driver.findElement(By.xpath("//input[contains(@id,'btn_cif')]")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'TimKiemCustomer')]")));
        waitElement(By.xpath("//select[contains(@id,'DlCriterialSearch')]"));
        Select cif = new Select(driver.findElement(By.xpath("//select[contains(@id,'DlCriterialSearch')]")));
        cif.selectByVisibleText(data.get(0).get(0));
        driver.findElement(By.xpath("//input[contains(@id,'txtKey')]")).sendKeys(data.get(0).get(1));
        driver.findElement(By.xpath("//input[contains(@id,'btTimKiem')]")).click();
        waitElement(By.xpath("//td[text()='" + data.get(0).get(1) + "']"));
        driver.findElement(By.xpath("//td[text()='" + data.get(0).get(1) + "']")).click();
//        Thread.sleep(30000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'HeThongDungChung')]")));
        Select trinhdohocvan = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_TrinhDoHocVan')]")));
        trinhdohocvan.selectByVisibleText(data.get(0).get(2));
        Select tinhtranghonnhan = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_TinhTrangHonNhan')]")));
        tinhtranghonnhan.selectByVisibleText(data.get(0).get(3));
        Select tinhtrangcutru = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_TinhTrangNoiCuTru')]")));
        tinhtrangcutru.selectByVisibleText(data.get(0).get(4));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_ThoiGianCuTru_Nam')]")).sendKeys(data.get(0).get(5));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_ThoiGianCuTru_Thang')]")).sendKeys(data.get(0).get(6));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_MatKhauXacThucKH')]")).sendKeys(data.get(0).get(7));
        Select noicap = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_NoiCap')]")));
        noicap.selectByVisibleText(data.get(0).get(8));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_SoNguoiPhuThuoc')]")).sendKeys(data.get(0).get(9));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_DienThoaiDiDong')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_DienThoaiDiDong')]")).sendKeys(data.get(0).get(19));
        Select hokhauchinhchu = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_HoKhau_TinhThanh')]")));
        hokhauchinhchu.selectByVisibleText(data.get(0).get(10));
        Thread.sleep(1000);
        Select quanhuyenchinhchu = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_HoKhau_QuanHuyen')]")));
        quanhuyenchinhchu.selectByVisibleText(data.get(0).get(11));
        Thread.sleep(1000);
        Select phuongxachinhchu = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_HoKhau_PhuongXa')]")));
        phuongxachinhchu.selectByVisibleText(data.get(0).get(12));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_HoKhau_SoNhaTenDuong')]")).sendKeys(data.get(0).get(13));
        Select hokhautinhthanh = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_CuTru_TinhThanh')]")));
        hokhautinhthanh.selectByVisibleText(data.get(0).get(14));
        Thread.sleep(1000);
        Select hokhauquanhuyen = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_CuTru_QuanHuyen')]")));
        hokhauquanhuyen.selectByVisibleText(data.get(0).get(15));
        Thread.sleep(1000);
        Select hokhauphuongxa = new Select(driver.findElement(By.xpath("//select[contains(@id,'ChuTheChinh_CuTru_PhuongXa')]")));
        hokhauphuongxa.selectByVisibleText(data.get(0).get(16));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_CuTru_SoNhaTenDuong')]")).sendKeys(data.get(0).get(17));
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_Email')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ChuTheChinh_Email')]")).sendKeys(data.get(0).get(18));
    }

    @And("^I fill all data at Thông tin thẩm định as below$")
    public void iFillAllDataAtThôngTinThẩmĐịnhAsBelow(DataTable contactInfo) {
        List<List<String>> data = contactInfo.raw();
        Select thamdinhthucte = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_ThamDinhThucTe')]")));
        thamdinhthucte.selectByVisibleText(data.get(0).get(0));
        Select manhomkhcaptindung = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_MaNhomKHCapTinDung')]")));
        manhomkhcaptindung.selectByVisibleText(data.get(0).get(1));
        Select dexuathoiso = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_DeXuat_DVKD')]")));
        dexuathoiso.selectByVisibleText(data.get(0).get(2));
        Select madexuathoiso = new Select(driver.findElement(By.xpath("//select[contains(@id,'ThamDinh_MaDeXuat_DVKD')]")));
        madexuathoiso.selectByVisibleText(data.get(0).get(3));
        driver.findElement(By.xpath("//input[contains(@id,'ThamDinh_HanMucTinDungChoThe_DVKD')]")).sendKeys(data.get(0).get(4));
    }

    @And("^I fill all data in Thông Tin Hồ sơ form as below$")
    public void iFillAllDataInThôngTinHồSơFormAsBelow(DataTable contactInfo) {
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'LoTheAddTTT')]")));
        List<List<String>> data = contactInfo.raw();
        Select loainghiepvu = new Select(driver.findElement(By.xpath("//select[contains(@id,'Chung_Bieumau')]")));
        loainghiepvu.selectByVisibleText(data.get(0).get(0));
        Select donvikinhdoanh = new Select(driver.findElement(By.xpath("//select[contains(@id,'HoSo_DVKD')]")));
        donvikinhdoanh.selectByVisibleText(data.get(0).get(1));
        Select loaihoso = new Select(driver.findElement(By.xpath("//select[contains(@id,'HoSo_LoaiHoSo')]")));
        loaihoso.selectByVisibleText(data.get(0).get(2));
        Select chinhsachcaptindung = new Select(driver.findElement(By.xpath("//select[contains(@id,'HoSo_ChinhSachCapTinDung')]")));
        chinhsachcaptindung.selectByVisibleText(data.get(0).get(3));
    }

    @And("^I fill all data in Đơn vị tiếp nhận hồ sơ as below$")
    public void iFillAllDataInĐơnVịTiếpNhậnHồSoAsBelow(DataTable contactInfo) {
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

    @And("^I get the above file code$")
    public void iGetTheAboveFileCode() throws Exception {
        waitElement(By.xpath("//table[@class='table table-hover table-bordered']//tr[2]/td[2]"));
        fileCode = driver.findElement(By.xpath("//table[@class='table table-hover table-bordered']//tr[2]/td[2]")).getText();
        System.out.println("=================File code is " + fileCode);
        write_file();
        Thread.sleep(1000);
    }

    @And("^I send request with the above file code from (A1|A2|A3|A4|A5|A6|A7|A8) user$")
    public void iSendRequestWithTheAboveFileCode(String type) throws Exception {
        switch (type) {
            case "A1":
            case "A7":
                waitElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'GuiYeuCau')]"));
                driver.findElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'GuiYeuCau')]")).click();
                Thread.sleep(2000);
                break;
            case "A6":
                waitElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'CloseYC')]"));
                driver.findElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'CloseYC')]")).click();
                Thread.sleep(2000);
                break;
            default:
                waitElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'DongYChuyen')]"));
                driver.findElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'DongYChuyen')]")).click();
                Thread.sleep(2000);
                break;
        }

    }

    @And("^I return with the above file code from (A2|A3|A5|A6|A8) user$")
    public void iReturnWithTheAboveFileCodeFromAUser(String type) throws Exception {
        switch (type) {
            default:
                waitElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'YeuCauBoSung')]"));
                driver.findElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'YeuCauBoSung')]")).click();
                Thread.sleep(2000);
                break;
        }
    }

    @And("^I send additional request with the above file code from (A1|A2|A3|A4|A5|A6|A7|A8) user$")
    public void iSendAdditionalRequestWithTheAboveFileCodeFromAUser(String type) throws Exception {
        switch (type) {
            default:
                waitElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'ChuyenBS')]"));
                driver.findElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'ChuyenBS')]")).click();
                Thread.sleep(2000);
                break;
        }
    }

    @When("^I search with the above request code from \"([^\"]*)\"$")
    public void iSearchWithTheAboveRequestCode(String QL) throws Exception {
        waitElement(By.xpath("//a[contains(@href,'" + QL + "')]"));
        driver.findElement(By.xpath("//a[contains(@href,'" + QL + "')]")).click();
        driver.findElement(By.xpath("//input[contains(@id,'NoiDungTimKiem')]")).sendKeys(read_file("fileCode.txt"));
        driver.findElement(By.xpath("//input[@value='Tìm kiếm']")).click();
        Thread.sleep(2000);
    }

    @Then("^I choose \"([^\"]*)\" user to approve$")
    public void iChooseUserWithCommentToApprove(String user) throws Throwable {
        waitElement(By.xpath("//option[@title='" + user + "']"));
        driver.findElement(By.xpath("//option[@title='" + user + "']")).click();
        driver.findElement(By.id("btnXacNhanGuiThongTin")).click();
    }

    @Then("^I choose \"([^\"]*)\" from A7 user to approve$")
    public void iChooseFromAUserToApprove(String user) throws Throwable {
        waitElement(By.xpath("//select[@id='drlNguoiDuyet1']/option[@title='" + user + "']"));
        driver.findElement(By.xpath("//select[@id='drlNguoiDuyet1']/option[@title='" + user + "']")).click();
        driver.findElement(By.id("btnChonNguoiDuyet")).click();
        Thread.sleep(1000);
        waitElement(By.xpath("//select[@id='drlNguoiDuyet2']/option[@title='" + user + "']"));
        driver.findElement(By.xpath("//select[@id='drlNguoiDuyet2']/option[@title='" + user + "']")).click();
        driver.findElement(By.id("btnXacNhanGuiThongTin")).click();
    }

    @Then("^I select \"([^\"]*)\" user to approve$")
    public void iSelectUserToApprove(String user) throws Throwable {
        waitElement(By.xpath("//select[@id='drlNguoiDuyet1']/option[@title='" + user + "']"));
        driver.findElement(By.xpath("//select[@id='drlNguoiDuyet1']/option[@title='" + user + "']")).click();
        driver.findElement(By.id("btnAddNguoiDuyet")).click();
        Thread.sleep(1000);
        waitElement(By.xpath("//select[@id='drlNguoiDuyet2']/option[@title='" + user + "']"));
        driver.findElement(By.xpath("//select[@id='drlNguoiDuyet2']/option[@title='" + user + "']")).click();
        driver.findElement(By.id("btnXacNhanPheDuyet")).click();
    }

    @Then("^I select \"([^\"]*)\" user to return$")
    public void iSelectUserToReturn(String user) throws Throwable {
        waitElement(By.xpath("//option[@title='" + user + "']"));
        driver.findElement(By.xpath("//option[@title='" + user + "']")).click();
        driver.findElement(By.id("btnYeuCauBoSung")).click();
    }

    @Then("^I search \"([^\"]*)\" status$")
    public void iSearchStatus(String status) throws Throwable {
        waitElement(By.xpath("//select[contains(@id,'TrangThaiDuyet')]"));
        Select chuongtrinhtiepthi = new Select(driver.findElement(By.xpath("//select[contains(@id,'TrangThaiDuyet')]")));
        chuongtrinhtiepthi.selectByVisibleText(status);
        driver.findElement(By.xpath("//input[contains(@id,'btnSearch')]")).click();
        Thread.sleep(3000);
    }

    @And("^I verify the above request code exist in Quản lý table with status is \"([^\"]*)\"$")
    public void iVerifyTheAboveRequestCodeExistInQuảnLýDuyệtYêuCầuWithStatusIs(String status) throws Throwable {
        waitElement(By.xpath("//table[@class='table table-hover table-bordered']"));
        String actualString = driver.findElement(By.xpath("//table[@class='table table-hover table-bordered']")).getText();
        System.out.println("**************** Data table" + actualString);
        assertTrue(actualString.contains(read_file("fileCode.txt")));
        assertTrue(actualString.contains(status));
    }

    @Then("^I confirm the above additional request with (A1|A2|A3|A4|A5|A6|A7|A8) user$")
    public void iConfirmTheAboveAdditionalRequest(String type) throws Exception {
        switch (type) {
            case "A1":
                waitElement(By.id("btnXacNhanGuiThongTin"));
                driver.findElement(By.id("btnXacNhanGuiThongTin")).click();
                break;
            default:
                waitElement(By.id("btnYeuCauBoSung"));
                driver.findElement(By.id("btnYeuCauBoSung")).click();
                break;
        }

    }

    @And("^I edit information before sending request with the above file code from (A1|A2|A3|A4|A5|A6|A7|A8) user$")
    public void iEditInformationBeforeSendingRequestWithTheAboveFileCodeFromAUser(String user) throws Exception {
        switch (user) {
            default:
                waitElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'Sua')]"));
                driver.findElement(By.xpath("//tr//td[text()='" + read_file("fileCode.txt") + "']//following-sibling::td//a//img[contains(@src,'Sua')]")).click();
                Thread.sleep(2000);
                break;
        }
    }

    @Then("^I input \"([^\"]*)\" to approve$")
    public void iInputToApprove(String email) throws Throwable {
        waitElement(By.id("txtEmailCCKhac"));
        driver.findElement(By.id("txtEmailCCKhac")).sendKeys(email);
        driver.findElement(By.id("btnYeuCauBoSung")).click();
    }

    @Then("^I input \"([^\"]*)\" to end the process$")
    public void iInputToEndTheProcess(String email) throws Throwable {
        waitElement(By.id("txtToPheDuyet"));
        driver.findElement(By.id("txtToPheDuyet")).sendKeys(email);
        driver.findElement(By.id("btnXacNhanPheDuyet")).click();
    }

    @Then("^I input \"([^\"]*)\" to approve from (A1|A2|A3|A4|A5|A6|A7|A8)$")
    public void iInputToApproveFromA(String email, String user) throws Throwable {
        switch (user){
            case"A1":
                waitElement(By.id("txtDanhSachEmailCC_GuiThongTin"));
                driver.findElement(By.id("txtDanhSachEmailCC_GuiThongTin")).sendKeys(email);
                driver.findElement(By.id("btnXacNhanGuiThongTin")).click();
                break;
            default:
                waitElement(By.id("txtEmailCCKhac"));
                driver.findElement(By.id("txtEmailCCKhac")).sendKeys(email);
                driver.findElement(By.id("btnYeuCauBoSung")).click();
                break;
        }
    }

    @Then("^I select \"([^\"]*)\" user to confirm$")
    public void iSelectUserToConfirm(String user) throws Throwable {
        waitElement(By.xpath("//select[@id='drlNguoiDuyet1']/option[@title='" + user + "']"));
        driver.findElement(By.xpath("//select[@id='drlNguoiDuyet1']/option[@title='" + user + "']")).click();
        driver.findElement(By.id("btnChonNguoiDuyet")).click();
        waitElement(By.id("btnXacNhanGuiThongTin"));
        driver.findElement(By.id("btnXacNhanGuiThongTin")).click();
    }


}
