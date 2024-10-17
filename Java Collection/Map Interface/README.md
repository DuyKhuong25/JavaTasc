# Java Collection - Map Interface

## Khái niệm

- Map interface là một interface đại diện cho một tập hợp các phần tử theo dạng key-value và không cho phép sự trùng lặp về key của phần tử.

## Các lớp thực thi của Map Interface

### 1.HashMap

- HashMap sử dụng một bảng hash để lưu trữ các phần tử dạng key-value không trùng lặp về key và không đảm bảo thứ tự của các phần tử.

Cách khởi tạo:

``` Map<DataType Data Type> arr = new HasMap<>() ```

- Thích hợp cho các tập hợp dữ liệu không cần thứ tự và không cho phép phần tử trùng lặp về key và truy xuất nhanh hơn LinkedHashMap vì không lưu thứ tự phần tử.

### 2.LinkedHashMap

- LinkedHashMap sử dụng một bảng hash để lưu trữ các phần tử có duy trì thứ tự phần tử và không có sự trùng lặp các phần tử về key.

Cách khởi tạo:

``` Map<DataType Data Type> arr = new LinkedHashMap<>() ```

- Thích hợp cho các tập hợp dữ liệu cần duy trì thứ tự phần tử và không cho phép phần tử trùng lặp về key và truy xuất chậm hơn HashMap vì phải lưu thứ tự phần tử.
