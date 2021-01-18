@regression @registerWithA7
Feature: Register with user a7nv

  @registerWithA7-01
  Scenario Outline: register Hồ sơ thẻ TTT tự kinh doanh with cif number
    Given I access link with "a7nv" and "Abc123!@#"
    When I click New button
    Then I choose "Hồ sơ thẻ TTT tự kinh doanh"
    And I fill all data in Thông Tin Hồ sơ form as below
      | Hồ sơ thẻ TTT tự kinh doanh | HO_400 ~ Trung tâm thẻ | Hồ sơ nhanh | TN01 - TN từ lương |
    And I fill all data in Thông tin chủ thẻ chính with cif as below
      | Customer CIF | <cif> | Đại học | Độc thân | Tự sở hữu | 20 | 10 | 123456 | Tỉnh Tuyên Quang | 2 | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | qcteam@hdbank.com.vn |0983234167|
    And I fill all data in Thông tin nghề nghiệp as below
      | Nhân viên | Chính thức | BUSINESS NAME | DN tiền gửi Chi lương tại HDBank | Cổ phần | 0285556664 | 123 |Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành|174 Phan Dang Luu |
    And I fill all data in Thông tin tài chính as below
      | Qua TK tại HDBank | Nhóm 2 | Nhóm 3 | Nhóm 4 | Nhóm 5 | 20000000 | 20000000 |
    And I fill all data in Thông tin tham chiếu as below
      | Anh, chị, em | QC TEAM | 0983234167 |
    And I fill all data in Đơn vị tiếp nhận hồ sơ as below
      | Ecom | HD000020 |
    And I fill all data in Thông tin thẻ tín dụng
      | CN/PGD HDBank | <client code> | Email | <fee policy> | Địa chỉ thường trú | 0983234167 | <card type> | Không trích nợ tự động |QC TEST|011252487|0983234167|12|
    Then I save all information
    And I get the above file code
    And I verify the above request code exist in Quản lý table with status is "Hồ sơ mới"
    Examples:
      | cif      | card type                           | client code | fee policy               |
#      | 00014381 | 001-MC Credit Classic               | RGL         | Thu phí thường niên      |
      | 00013330 | 001-Local Credit Chain              | ABT         | Miễn phí thường niên     |
      | 00013332 | 001-Local Credit Gold               | RGL         | Miễn 50% phí thường niên |
      | 00013333 | 001-VISA Credit VietJet VIP Partner | RGL         | Miễn 50% phí thường niên |
      | 00013334 | 001-MC Credit Platinum              | RGL         | Thu phí thường niên      |
#      | 00014386 | 001-MC Credit Platinum              | RGL         | Thu phí thường niên      |
