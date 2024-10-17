# Java Collection - List Interface

## Khái niệm

- List interface là một interface đại diện cho một tập hợp các phần tử có thứ tự và cho phép sự trùng lặp phần tử.

## Các lớp thực thi của List Interface

### 1.ArrayList

- ArrayList là một lớp triển khai của List Interface cho phép lưu trữ phần tử theo dạng mảng động có thể thay đổi kích thước so với mảng thông thường 
các phần tử có thể được lưu trữ trùng lặp việc truy cập các phần tử dựa trên index.

- Thao tác thêm và xóa phần tử với ArrayList là chậm bởi vì nó sử dụng nội bộ mảng. Bởi vì sau khi thêm hoặc xóa các phần tử cần sắp xếp lại.

- Truy xuất phần tử trong ArrayList nhanh hơn LinkedList. Bởi vì các phần tử trong ArrayList được lưu trữ dựa trên chỉ mục (index).

Cách khởi tạo ArrayList
``` List<Data Type> arr = new ArrayList<>() ```

ArrayList thích hợp khi ứng dụng muốn truy cập nhanh vào các phần tử và ít thao tác thêm và xóa

### 2.LinkedList

- LinkedList là một lớp triển khai List Interface cho phép lưu trữ phần tử dạng danh sách liên kết, mỗi phần tử được lưu trong các nút lưu các thông tin
của phần tử đó và thông tin tham chiếu của các nút trước và sau nó theo dạng liên kết đôi các phần tử được cho phép trùng lặp

- Thao tác thêm và xóa phần tử với LinkedList nhanh hơn ArrayList. Bởi vì nó không cần sắp xếp lại các phần tử sau khi thêm hoặc xóa vì 
nó chỉ cần cập nhật lại tham chiếu tới phần tử phía trước và sau nó.

- Thao tác truy xuất phần tử trong LinkedList chậm hơn nhiều so với ArrayList. Bởi vì, nó phải duyệt qua lần lượt các phần tử từ đầu tiên cho đến cuối cùng.

Cách khởi tạo ArrayList
``` List<Data Type> arr = new LinkedList<>() ```

LinkedList thích hợp với các ứng dụng phải thao tác thêm và xóa nhiều
