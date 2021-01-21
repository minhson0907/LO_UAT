@regression @assign_TTT_self_assignauto46
Feature: Hồ sơ thẻ TTT tự kinh doanh - auto assign

  @assign_TTT_self_assignauto46-01
  Scenario Outline: register Hồ sơ thẻ TTT tự kinh doanh with cif number
    Given I access link with "a7nv" and "Abc123!@#"
    When I click New button
    Then I choose "Hồ sơ thẻ TTT tự kinh doanh"
    And I fill all data in Thông Tin Hồ sơ form as below
      | Hồ sơ thẻ TTT tự kinh doanh | HO_400 ~ Trung tâm thẻ | <record type> | TN01 - TN từ lương |
    And I fill all data in Thông tin chủ thẻ chính with cif as below
      | Customer CIF | <cif> | Đại học | Độc thân | Tự sở hữu | 20 | 10 | 123456 | Tỉnh Tuyên Quang | 2 | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | qcteam@hdbank.com.vn | 0983234167 |
    And I fill all data in Thông tin nghề nghiệp as below
      | Nhân viên | Chính thức | BUSINESS NAME | DN tiền gửi Chi lương tại HDBank | Cổ phần | 0285556664 | 123 | Tỉnh Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành |174 Phan Dang Luu |
    And I fill all data in Thông tin tài chính as below
      | Qua TK tại HDBank | Nhóm 2 | Nhóm 3 | Nhóm 4 | Nhóm 5 | 20000000 | 20000000 |
    And I fill all data in Thông tin tham chiếu as below
      | Anh, chị, em | QC TEAM | 0983234167 |
    And I fill all data in Đơn vị tiếp nhận hồ sơ as below
      | Ecom | HD000004 | HD000020 |
    And I fill all data in Thông tin thẻ tín dụng
      | CN/PGD HDBank | <client code> | Email | <fee policy> | Địa chỉ thường trú | 0983234167 | <card type> | Không trích nợ tự động | QC TEST | 011252487 | 0983234167 |12|
    Then I save all information
    And I get the above file code
    And I verify the above request code exist in Quản lý table with status is "Hồ sơ mới"
    And I send request with the above file code from A7 user
    Then I select "Phân công tự động" user to confirm
    Examples:
      | cif      | card type                           | client code | fee policy               | record type        |
#      | 00003061 | 001-MC Credit Classic               | RGL         | Thu phí thường niên      | VIP                |
      | 01357969 | 001-Local Credit Chain              | ABT         | Miễn phí thường niên     | Thẻ phụ            |
#      | 0000 3061 | 001-Local Credit Gold               | RGL         | Miễn 50% phí thường niên | Hồ sơ online       |
#      | 00003061 | 001-VISA Credit VietJet VIP Partner | RGL         | Miễn 50% phí thường niên | Hồ sơ nhanh        |
#      | 00003052 | 001-MC Credit Platinum              | RGL         | Thu phí thường niên      | Hồ sơ thông thường |

#  @assign_TTT_self_assignauto-02
#  Scenario: approve with user a4nv
#    Given I access link with "a4nv" and "Abc123!@#"
#    When I search with the above request code from "QLPheDuyetYeuCau"
#    And I send request with the above file code from A4 user
#    Then I select "Nguyễn Văn A8" user to approve
#
#  @assign_TTT_self_assignauto-03
#  Scenario: approve with user a8nv
#    Given I access link with "a8nv" and "Abc123!@#"
#    When I search with the above request code from "QLPheDuyetYeuCau"
#    And I send request with the above file code from A8 user
#    Then I select "Phân công tự động" user to approve

