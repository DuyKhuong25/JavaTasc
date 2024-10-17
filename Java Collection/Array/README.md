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
