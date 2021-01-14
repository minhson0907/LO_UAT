@regression @registerWithA1
Feature: Register with user a1nv

  @registerWithA1-01
  Scenario: register Hồ sơ thẻ phê duyệt tại Trung Tâm Thẻ with cif number
    Given I access link with "a1nv" and "Abc123!@#"
    When I click New button
    Then I choose "Hồ sơ thẻ phê duyệt tại Trung Tâm Thẻ"
    And I fill all data in Thông Tin Hồ sơ as below
      | Hồ sơ thẻ phê duyệt tại Trung Tâm Thẻ | 002 ~ CN PHU NHUAN | Hồ sơ thông thường | TN01 - TN từ lương |
    And I fill all data in Thông tin chủ thẻ chính with cif as below
      | Customer CIF | 01357964 | Đại học | Độc thân | Tự sở hữu | 20 | 10 | 123456 | Tỉnh Tuyên Quang | 2 | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | qcteam@hdbank.com.vn | 0983234167 |
    And I fill all data in Thông tin nghề nghiệp as below
      | Nhân viên | Chính thức | BUSINESS NAME | DN tiền gửi Chi lương tại HDBank | Cổ phần | 0285556664 | 123 | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành |
    And I fill all data in Thông tin tài chính as below
      | Qua TK tại HDBank | Nhóm 2 | Nhóm 3 | Nhóm 4 | Nhóm 5 | 20000000 | 20000000 |
    And I fill all data in Thông tin tham chiếu as below
      | Anh, chị, em | QC TEAM | 0983234167 |
    And I fill all data in Đơn vị tiếp nhận hồ sơ as below
      | Ecom | HD000020 |
    And I fill all data in Thông tin thẻ tín dụng
      | CN/PGD HDBank | RGL | Email | Thu phí thường niên | Địa chỉ thường trú | 0983234167 | 001-MC Credit Classic | Không trích nợ tự động | QC TEST | 011252487 | 0983234167 |
    And I fill all data in Thông tin thẩm định as below
      | Công ty | TN01 - TN từ lương | Đồng ý | A01 - Quy định | 30000000 |
    And I fill all data in Thông tin phê duyệt as below
      | Phê duyệt cá nhân |
    Then I save all information
    And I get the above file code
    And I verify the above request code exist in Quản lý table with status is "Hồ sơ mới"

  @registerWithA1-02
  Scenario Outline: register Hồ sơ phê duyệt tại ĐVKD with cif number
    Given I access link with "a1nv" and "Abc123!@#"
    When I click New button
    Then I choose "Hồ sơ phê duyệt tại ĐVKD"
    And I fill all data in Thông Tin Hồ sơ as below
      | Hồ sơ phê duyệt tại ĐVKD | 002 ~ CN PHU NHUAN | Hồ sơ nhanh | TN01 - TN từ lương |
    And I fill all data in Thông tin chủ thẻ chính with cif as below
      | Customer CIF | <cif> | Đại học | Độc thân | Tự sở hữu | 20 | 10 | 123456 | Tỉnh Tuyên Quang | 2 | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | qcteam@hdbank.com.vn | 0983234167 |
    And I fill all data in Thông tin nghề nghiệp as below
      | Nhân viên | Chính thức | BUSINESS NAME | DN tiền gửi Chi lương tại HDBank | Cổ phần | 0285556664 | 123 | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành |
    And I fill all data in Thông tin tài chính as below
      | Qua TK tại HDBank | Nhóm 2 | Nhóm 3 | Nhóm 4 | Nhóm 5 | 20000000 | 20000000 |
    And I fill all data in Thông tin tham chiếu as below
      | Anh, chị, em | QC TEAM | 0983234167 |
    And I fill all data in Đơn vị tiếp nhận hồ sơ as below
      | Ecom | HD000020 |
    And I fill all data in Thông tin thẻ tín dụng
      | CN/PGD HDBank | <client code> | Email | Thu phí thường niên | Địa chỉ thường trú | 0983234167 | <card type> | Không trích nợ tự động | QC TEST | 011252487 | 0983234167 |
    And I fill all data at Thông tin thẩm định as below
      | Công ty | TN01 - TN từ lương | Đồng ý | A01 - Quy định | <limit> |
    And I fill all data in Thông tin phê duyệt as below
      | Phê duyệt cá nhân |
    Then I save all information
    And I get the above file code
    And I verify the above request code exist in Quản lý table with status is "Hồ sơ mới"
    Examples:
      | cif      | card type                           | client code | limit     |
#      | 00015405 | 001-MC Credit Classic               | RGL         | 30000000  |
#      | 00015405 | 001-Local Credit Chain              | ABT         | 30000000  |
      | 00015405 | 001-Local Credit Gold               | RGL         | 50000000  |
#      | 00015405 | 001-VISA Credit VietJet VIP Partner | RGL         | 30000000  |
#      | 00015405 | 001-MC Credit Platinum              | RGL         | 500000000 |
