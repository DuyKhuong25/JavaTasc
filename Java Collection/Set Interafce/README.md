# Java Collection - Set Interface

## Khái niệm

- Set interface là một interface đại diện cho một tập hợp các phần tử không có thứ tự và không cho phép sự trùng lặp phần tử.

## Các lớp thực thi của Set Interface

### 1.HashSet

- HashSet sử dụng một bảng hash để lưu trữ các phần tử, không đảm bảo thứ tự của các phần tử.

Cách khởi tạo:

``` Set<Data Type> arr = new HasSet<>() ```

- Thích hợp cho các tập hợp dữ liệu không cần thứ tự và không cho phép phần tử trùng lặp.

### 2.LinkedHashSet

- LinkedHashSet sử dụng một bảng hash để lưu trữ các phần tử có duy trì thứ tự phần tử và không có sự trùng lặp các phần tử.

Cách khởi tạo:

``` Set<Data Type> arr = new LinkedHashSet<>() ```

- Thích hợp cho các tập hợp dữ liệu cần duy trì thứ tự và không cho phép phần tử trùng lặp.
