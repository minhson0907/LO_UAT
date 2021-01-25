@regression @hsthepheduyetTTT_full_editA5_editA6_returnA6_editA8
Feature: Hồ sơ thẻ phê duyệt tại Trung tâm thẻ

  @hsthepheduyetTTT_full_editA5_editA6_returnA6_editA8-01
  Scenario: register Hồ sơ thẻ phê duyệt tại Trung Tâm Thẻ with cif number
    Given I access link with "a1nv" and "Abc123!@#"
    When I click New button
    Then I choose "Hồ sơ thẻ phê duyệt tại Trung Tâm Thẻ"
    And I fill all data in Thông Tin Hồ sơ as below
      | Hồ sơ thẻ phê duyệt tại Trung Tâm Thẻ | 002 ~ CN PHU NHUAN | Hồ sơ thông thường | TN01 - TN từ lương |
    And I fill all data in Thông tin chủ thẻ chính with cif as below
      | Customer CIF | 00014377 | Đại học | Độc thân | Tự sở hữu | 20 | 10 | 123456 | Tuyên Quang | 2 | Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu | qcteam@hdbank.com.vn | 0983234167 |
    And I fill all data in Thông tin nghề nghiệp as below
      | Nhân viên | Chính thức | BUSINESS NAME | DN tiền gửi Chi lương tại HDBank | Cổ phần | 0285556664 | 123 | Tuyên Quang | Huyện Hàm Yên | Xã Tân Thành | 174 Phan Dang Luu |
    And I fill all data in Thông tin tài chính as below
      | Qua TK tại HDBank | Nhóm 2 | Nhóm 3 | Nhóm 4 | Nhóm 5 | 20000000 | 20000000 |
    And I fill all data in Thông tin tham chiếu as below
      | Anh, chị, em | QC TEAM | 0983234167 |
    And I fill all data in Đơn vị tiếp nhận hồ sơ as below
      | Ecom | HD000004 | HD000020 |
    And I fill all data in Thông tin thẻ tín dụng
      | CN/PGD HDBank | RGL | Email | Thu phí thường niên | Địa chỉ thường trú | CN PHU NHUAN | 001-MC Credit Classic | Không trích nợ tự động | QC TEST | 011252487 | 0983234167 | 12 |
    And I fill all data at Thông tin thẩm định as below
      | Công ty | Theo bút phê cấp phê duyệt | Đồng ý | A01 - Quy định | 30000000 |
    And I fill all data in Thông tin phê duyệt as below
      | Phê duyệt cá nhân | Đồng ý |
    Then I save all information
    And I get the above file code
    And I verify the above request code exist in Quản lý table with status is "Hồ sơ mới"
    And I send request with the above file code from A1 user
    Then I choose "Nguyễn Văn A2" user to approve

  @hsthepheduyetTTT_full_editA5_editA6_returnA6_editA8-02
  Scenario: approve with user a2nv
    Given I access link with "a2nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A2 user
    Then I select "Nguyễn Văn A4" user to approve

  @hsthepheduyetTTT_full_editA5_editA6_returnA6_editA8-03
  Scenario: approve with user a4nv
    Given I access link with "a4nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A4 user
    Then I select "Nguyễn Văn A8" user to approve

  @hsthepheduyetTTT_full_editA5_editA6_returnA6_editA8-04
  Scenario: approve with user a8nv
    Given I access link with "a8nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A8 user
    Then I select "Nguyễn Văn A4" user to approve

  @hsthepheduyetTTT_full_editA5_editA6_returnA6_editA8-05
  Scenario: approve with user a4nv
    Given I access link with "a4nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A4 user
    Then I select "Nguyễn Văn A5" user to approve

  @hsthepheduyetTTT_full_editA5_editA6_returnA6_editA8-06
  Scenario: approve with user a5nv
    Given I access link with "a5nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I edit information before sending request with the above file code from A5 user
    And I edit information in Thông tin chủ thẻ chính as below
      | THPT | Ly hôn | Thuê | 21 | 8 | 654321 | Tiền Giang | 0 | Tiền Giang | Huyện Cái Bè | Thị trấn Cái Bè | 17 Trương Công Định | Tiền Giang | Huyện Cái Bè | Thị trấn Cái Bè | 17 Trương Công Định | qcteam@hdbank.com.vn | 0976558597 |
    And I edit information in Thông tin nghề nghiệp as below
      | Quản lý | Chính thức | BUSINESS NAME | DN thuộc TOP 500 | Cổ phần | 0285556664 | 123 | Tiền Giang | Huyện Cái Bè | Thị trấn Cái Bè |
    And I edit information in Thông tin tài chính as below
      | Tiền mặt | Nhóm 5 | Nhóm 4 | Nhóm 3 | Nhóm 1 | 15000000 | 10000000 |
    And I edit information in Thông tin tham chiếu as below
      | Con | QC EDIT | 0909666777 |
    And I edit information in Đơn vị tiếp nhận hồ sơ as below
      | Ecom | HD000004 | HD000020 |
    And I edit information in Thông tin thẻ tín dụng
      | Địa chỉ công ty | SALE_ONLINE | Bưu điện | Miễn phí thường niên | Địa chỉ thường trú | CN LANH BINH THANG | 001-Visa Credit Vietjet SOVICO VIP | RGL | Không trích nợ tự động | 24 |
    And I edit information at Thông tin thẩm định as below
      | Nhà tạm trú | 10000000 | Đồng ý | A03 - Ngoại lệ đối tượng |
    And I edit information in Thông tin phê duyệt as below
      | Phê duyệt cá nhân | A5 | 10000000 | Đồng ý với điều kiện |
    Then I save all information
    And I send request with the above file code from A5 user
    Then I select "Nguyễn Văn A6" user to approve

  @hsthepheduyetTTT_full_editA5_editA6_returnA6_editA8-07
  Scenario Outline: approve with user a6nv
    Given I access link with "a6nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I edit information before sending request with the above file code from A7 user
    And I edit information in Thông tin chủ thẻ chính as below
      | Đại học | Độc thân | Tự sở hữu | 20 | 10 | 123456 | Đồng Nai | 2 | Đồng Nai | Thị xã Long Khánh | Phường Xuân Trung | 88 Võ Văn Tần | Đồng Nai | Thị xã Long Khánh | Phường Xuân Trung | 88 Võ Văn Tần | qcteam@hdbank.com.vn | 0976558597 |
    And I edit information in Thông tin nghề nghiệp as below
      | Quản lý | Chính thức | BUSINESS NAME | DN thuộc TOP 500 | Cổ phần | 0285556664 | 123 | Đồng Nai | Thị xã Long Khánh | Phường Xuân Trung |
    And I edit information in Thông tin tài chính as below
      | Qua TK tại HDBank | Nhóm 4 | Nhóm 5 | Nhóm 2 | Nhóm 3 | 25000000 | 12000000 |
    And I edit information in Thông tin tham chiếu as below
      | Anh, chị, em | QC TEAM | 0983234167 |
    And I edit information in Đơn vị tiếp nhận hồ sơ as below
      | Ecom | HD000004 | HD000020 |
    And I edit information in Thông tin thẻ tín dụng
      | Địa chỉ công ty | SALE_ONLINE | Bưu điện | Miễn 50% phí thường niên | Địa chỉ thường trú | CN LANH BINH THANG | 001-Local Credit Gold | RGL | Không trích nợ tự động | 12 |
    And I edit information at Thông tin thẩm định as below
      | Nhà thường trú | 50000000 | Đồng ý | A03 - Ngoại lệ đối tượng |
    And I edit information in Thông tin phê duyệt as below
      | Phê duyệt cá nhân | A6 | 50000000 | Đồng ý với điều kiện |
    Then I save all information
    And I return with the above file code from A6 user
    Then I select "<user>" user to return
    Examples:
      | user            |
#      | Người tạo yêu cầu |
#      | Kiểm soát |
#      | Phê duyệt tại ĐVKD |
      | Tiếp nhận hồ sơ |

  @hsthepheduyetTTT_full_editA5_editA6_returnA6_editA8-08
  Scenario: approve with user a8nv
    Given I access link with "a8nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I edit information before sending request with the above file code from A7 user
    And I edit information in Thông tin hồ sơ as below
      | VIP | 168 ~ CN NGUYEN DINH CHIEU |
    And I edit information in Thông tin thẻ tín dụng
      | Địa chỉ công ty | SALE_ONLINE | Bưu điện | Miễn 50% phí thường niên | Địa chỉ thường trú | CN LANH BINH THANG | 001-VISA Credit Gold Regular | RGL | Không trích nợ tự động | 15 |
    Then I save all information
    And I send additional request with the above file code from A6 user
    Then I input "huyenlm2@hdbank.com.vn" to approve from A6

  @hsthepheduyetTTT_full_editA5_editA6_returnA6_editA8-09
  Scenario: approve with user a6nv
    Given I access link with "a6nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A6 user
    And I input "huyenlm2@hdbank.com.vn" to end the process
    Then I search "Tất cả" status
    And I verify the above request code exist in Quản lý table with status is "Close"
