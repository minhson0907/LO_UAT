@regression @hspheduyetDVKD_assignauto44
Feature: Hồ sơ phê duyệt tại Đơn vị kinh doanh - Assign auto

  @hspheduyetDVKD_assignauto44-01
  Scenario Outline: register Hồ sơ thẻ phê duyệt tại Đơn vị kinh doanh with cif number
    Given I access link with "a1nv" and "Abc123!@#"
    When I click New button
    Then I choose "Hồ sơ phê duyệt tại ĐVKD"
    And I fill all data in Thông Tin Hồ sơ as below
      | Hồ sơ phê duyệt tại ĐVKD | 168~Chi nhánh Nguyễn Đình Chiểu | <record type> | TN01 - TN từ lương |
    And I fill all data in Thông tin chủ thẻ chính with cif as below
      | Customer CIF | <cif> | Đại học | Độc thân | Tự sở hữu | 20 | 10 | 123456 | Tuyên Quang | 2 | Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | qcteam@hdbank.com.vn | 0983234167 |
    And I fill all data in Thông tin nghề nghiệp as below
      | Nhân viên | Chính thức | BUSINESS NAME | DN tiền gửi Chi lương tại HDBank | Cổ phần | 0285556664 | 123 | Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu |
    And I fill all data in Thông tin tài chính as below
      | Qua TK tại HDBank | Nhóm 2 | Nhóm 3 | Nhóm 4 | Nhóm 5 | 20000000 | 20000000 |
    And I fill all data in Thông tin tham chiếu as below
      | Anh, chị, em | QC TEAM | 0983234167 |
    And I fill all data in Đơn vị tiếp nhận hồ sơ as below
      | Ecom | HD003670 | HD000020 |
    And I fill all data in Thông tin thẻ tín dụng
      | CN/PGD HDBank | <client code> | Email | <fee policy> | Địa chỉ thường trú | Chi nhánh Lãnh Binh Thăng | <card type> | Không trích nợ tự động | QC TEST | 011252487 | 0983234167 | 12 | TN04 - TN từ chủ DN |
    And I fill all data at Thông tin thẩm định as below
      | Công ty | Theo bút phê cấp phê duyệt | Đồng ý | A01 - Quy định | <limit> |
    And I fill all data in Thông tin phê duyệt as below
      | Phê duyệt cá nhân | Đồng ý |
    Then I save all information
    And I get the above file code
    And I verify the above request code exist in Quản lý table with status is "Hồ sơ mới"
    And I send request with the above file code from A1 user
    Then I choose "Nguyễn Văn A2" from A1 user to approve
    Examples:
      | cif      | card type                       | client code | fee policy          | limit    | record type |
      | 00003308 | 001-VISA Credit Classic Regular | RGL         | Thu phí thường niên | 10000000 | VIP         |

  @hspheduyetDVKD_assignauto44-02
  Scenario: approve with user a2nv
    Given I access link with "a2nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A2 user
    Then I select "Nguyễn Văn A3" user to approve

  @hspheduyetDVKD_assignauto44-03
  Scenario: approve with user a3nv
    Given I access link with "a3nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A3 user
    Then I confirm to assign automatically

# Step sau tự check manual hs dc assign cho user nào trong file excel

