# Java Array

* Mảng trong Java

## 1.Khái niệm cơ bản về mảng

Mảng là cấu trúc dữ liệu lưu trữ một tập hợp các phần tử cùng kiểu (ví dụ: int, double, String).

Mảng có kích thước cố định khi được khai báo và không thể thay đổi kích thước này trong suốt quá trình chạy chương trình.

## 2.Khai báo và khởi tạo mảng

Khai báo mảng: ```dataType[] arrayName;```

Khởi tạo mảng:

Với kích thước cố định: ```arrayName = new dataType[size];```

Khai báo và khởi tạo cùng lúc: ```dataType[] arrayName = new dataType[size];```

Khởi tạo trực tiếp giá trị: ```dataType[] arrayName = {value1, value2, ...};```

## 3.Truy cập và thay đổi phần tử trong mảng

Truy cập phần tử qua chỉ số: ```array[index]```

Thay đổi giá trị: ```array[index] = newValue;```

## 4.Duyệt mảng

Sử dụng vòng for:

```for (int i = 0; i < array.length; i++) {```
    ```System.out.println(array[i]);```
```}```

Sử dụng vòng for-each:

```for (int element : array) {```
    ```System.out.println(element);```
```}```

## 5.Các phương thức tiện ích với mảng

array.length: Trả về kích thước của mảng.

Arrays.toString(array): Chuyển mảng thành chuỗi để hiển thị.

Arrays.sort(array): Sắp xếp mảng theo thứ tự tăng dần.

## 6.Mảng đa chiều

Mảng hai chiều: ```dataType[][] arrayName = new dataType[rows][columns];```
Khởi tạo trực tiếp: ```int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};```

## Note
Mảng trong Java có kiểu là một đối tượng, vì thế khi truyền mảng vào phương thức, sẽ là tham chiếu (reference) chứ không phải bản sao.

Các phần tử trong mảng sẽ được khởi tạo giá trị mặc định (0 cho kiểu số, null cho đối tượng).

## Ưu điểm và nhược điểm khi sử dụng mảng

### 1.Ưu điểm của mảng
Hiệu suất cao: Mảng có cấu trúc dữ liệu đơn giản, cho phép truy cập phần tử bằng chỉ số với thời gian truy cập O(1).

Quản lý bộ nhớ: Kích thước mảng được cố định khi khởi tạo nên dễ kiểm soát bộ nhớ, tránh rò rỉ bộ nhớ so với các cấu trúc động.

Tổ chức dữ liệu có thứ tự: Mảng giúp tổ chức dữ liệu theo thứ tự cố định, phù hợp cho các tình huống cần truy cập phần tử theo chỉ số hoặc thực hiện các thuật toán đơn giản.

Dễ thao tác trong các thuật toán: Một số thuật toán phổ biến như tìm kiếm, sắp xếp được tối ưu hóa cho mảng.

### 2.Nhược điểm của mảng
Kích thước cố định: Khi đã khởi tạo, không thể thay đổi kích thước của mảng. Điều này gây khó khăn khi không biết trước số lượng phần tử cần lưu trữ và muốn mở rộng mảng.

Không linh hoạt: Thêm hoặc xoá phần tử trong mảng cố định yêu cầu sao chép toàn bộ mảng mới, không tối ưu khi cần thao tác nhiều.

Thiếu tính năng tiện lợi: Mảng không hỗ trợ các phương thức tiện ích như add, remove, contains như ArrayList, làm cho mã nguồn trở nên phức tạp hơn khi thao tác với mảng lớn.

### 3.Khi nào nên sử dụng mảng?
Mảng phù hợp trong trường hợp kích thước dữ liệu cố định và yêu cầu truy cập nhanh theo chỉ số.

Khi cần hiệu suất truy cập tối ưu mà không cần đến tính năng linh hoạt, mảng có thể là lựa chọn tốt.
