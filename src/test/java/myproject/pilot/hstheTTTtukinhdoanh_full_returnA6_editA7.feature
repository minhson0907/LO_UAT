@regression @hstheTTTtukinhdoanh_full_returnA6_editA7
Feature: Hồ sơ thẻ TTT tự kinh doanh - full luồng

  @hstheTTTtukinhdoanh_full_returnA6_editA7-01
  Scenario Outline: register Hồ sơ thẻ TTT tự kinh doanh with cif number
    Given I access link with "a7nv" and "Abc123!@#"
    When I click New button
    Then I choose "Hồ sơ thẻ TTT tự kinh doanh"
    And I fill all data in Thông Tin Hồ sơ form as below
      | Hồ sơ thẻ TTT tự kinh doanh | HO_400 ~ Trung tâm thẻ | <record type> | TN01 - TN từ lương |
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
      | CN/PGD HDBank | <client code> | Bưu điện | <fee policy> | Địa chỉ công ty | Chi nhánh Lãnh Binh Thăng | <card type> | Không trích nợ tự động | QC TEST | 011252487 | 0983234167 | 12 |TN04 - TN từ chủ DN|
    Then I save all information
    And I get the above file code
    And I verify the above request code exist in Quản lý table with status is "Hồ sơ mới"
    And I send request with the above file code from A7 user
    Then I choose "Nguyễn Văn A4" from A7 user to approve
    Examples:
      | cif      | card type          | client code | fee policy           | record type        |
      | 01459716 | 001-MC Credit Gold | RGL         | Miễn phí thường niên | Hồ sơ thông thường |

  @hstheTTTtukinhdoanh_full_returnA6_editA7-02
  Scenario: approve with user a4nv
    Given I access link with "a4nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A4 user
    Then I select "Nguyễn Văn A8" user to approve

  @hstheTTTtukinhdoanh_full_returnA6_editA7-03
  Scenario: approve with user a8nv
    Given I access link with "a8nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A8 user
    Then I select "Nguyễn Văn A4" user to approve

  @hstheTTTtukinhdoanh_full_returnA6_editA7-04
  Scenario: approve with user a4nv
    Given I access link with "a4nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A4 user
    Then I select "Nguyễn Văn A5" user to approve

  @hstheTTTtukinhdoanh_full_returnA6_editA7-05
  Scenario: approve with user a5nv
    Given I access link with "a5nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A5 user
    Then I select "Nguyễn Văn A6" user to approve

  @hstheTTTtukinhdoanh_full_returnA6_editA7-06
  Scenario Outline: approve with user a6nv
    Given I access link with "a6nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I return with the above file code from A6 user
    Then I select "<user>" user to return
    Examples:
      | user              |
      | Người tạo yêu cầu |
#      | Kiểm soát |
#      | Phê duyệt tại ĐVKD |
#      | Tiếp nhận hồ sơ |

  @hstheTTTtukinhdoanh_full_returnA6_editA7-07
  Scenario: approve with user a7nv
    Given I access link with "a7nv" and "Abc123!@#"
    When I search with the above request code from "QLYeuCau"
    And I edit information before sending request with the above file code from A7 user
    And I edit information in Thông tin chủ thẻ chính as below
      | Đại học | Độc thân | Tự sở hữu | 20 | 10 | 123456 | Lai Châu | 2 | Lai Châu | Huyện Mường Tè | Xã Bum Nưa | Block C Khu công nghệ cao Q9 | Lai Châu | Huyện Mường Tè | Xã Bum Nưa | Block C Khu công nghệ cao Q9 | qcteam@hdbank.com.vn | 0976558597 |
    And I edit information in Thông tin nghề nghiệp as below
      | Quản lý | Chính thức | BUSINESS NAME | DN thuộc TOP 500 | Cổ phần | 0285556664 | 123 | Lai Châu | Huyện Mường Tè | Xã Bum Nưa |
    And I edit information in Thông tin tài chính as below
      | Qua TK tại HDBank | Nhóm 5 | Nhóm 4 | Nhóm 3 | Nhóm 2 | 30000000 | 10000000 |
    And I edit information in Thông tin tham chiếu as below
      | Anh, chị, em | QC TEAM | 0983234167 |
    And I edit information in Đơn vị tiếp nhận hồ sơ as below
      | Ecom | HD003670 | HD000020 |
    And I edit information in Thông tin thẻ tín dụng
      | Địa chỉ công ty | SALE_ONLINE | Bưu điện | Miễn 50% phí thường niên | Địa chỉ thường trú | Chi nhánh Lãnh Binh Thăng | 001-VISA Credit Classic Loan  | RGL | Không trích nợ tự động | 24 |TN01 - TN từ lương|
    Then I save all information
    And I send additional request with the above file code from A7 user
    Then I input "huyenlm2@hdbank.com.vn" to approve from A7

  @hstheTTTtukinhdoanh_full_returnA6_editA7-08
  Scenario: approve with user a6nv
    Given I access link with "a6nv" and "Abc123!@#"
    When I search with the above request code from "QLPheDuyetYeuCau"
    And I send request with the above file code from A6 user
    And I input "huyenlm2@hdbank.com.vn" to end the process
    Then I search "Tất cả" status
    And I verify the above request code exist in Quản lý table with status is "Close"

