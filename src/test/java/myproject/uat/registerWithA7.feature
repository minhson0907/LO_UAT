@regression @registerWithA7
Feature: Register with user a7nv

  @registerWithA7-01
  Scenario: register Hồ sơ thẻ TTT tự kinh doanh with cif number
    Given I access link with "a7nv" and "Abc123!@#"
    When I click New button
    Then I choose "Hồ sơ thẻ TTT tự kinh doanh"
    And I fill all data in Thông Tin Hồ sơ form as below
      | Hồ sơ thẻ TTT tự kinh doanh | HO_400 ~ Trung tâm thẻ | Hồ sơ nhanh | TN01 - TN từ lương |
    And I fill all data in Thông tin chủ thẻ chính with cif as below
      | Customer CIF | 00013325 | Đại học | Độc thân | Tự sở hữu | 20 | 10 | 123456 | Tỉnh Tuyên Quang | 2 | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | qcteam@hdbank.com.vn |0983234167|
    And I fill all data in Thông tin nghề nghiệp as below
      | Nhân viên | Chính thức | BUSINESS NAME | DN tiền gửi Chi lương tại HDBank | Cổ phần | 0285556664 | 123 |Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành|
    And I fill all data in Thông tin tài chính as below
      | Qua TK tại HDBank | Nhóm 2 | Nhóm 3 | Nhóm 4 | Nhóm 5 | 20000000 | 20000000 |
    And I fill all data in Thông tin tham chiếu as below
      | Anh, chị, em | QC TEAM | 0983234167 |
    And I fill all data in Đơn vị tiếp nhận hồ sơ as below
      | Ecom | HD000020 |
    And I fill all data in Thông tin thẻ tín dụng
      | CN/PGD HDBank | ABT | Bưu điện | Thu phí thường niên | Địa chỉ công ty | 0983234167 | 001-Local VCCS Credit Chain | Không trích nợ tự động |QC TEST|011252487|0983234167|
    Then I save all information
    And I get the above file code
    And I verify the above request code exist in Quản lý table with status is "Hồ sơ mới"
