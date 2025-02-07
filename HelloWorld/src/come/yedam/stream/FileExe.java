package come.yedam.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileExe {

	public static void main(String[] args) throws IOException {
		// ListExe.java 읽기
		char txt;
		try {
			Reader reader = new FileReader("c:/temp/ListExe.java");
			while (true) {
				int chr = reader.read();// char(2byte)
				System.out.print((char) chr); // 65 -> A
				if (chr == -1) {
					break;
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");

		// input 메서드 호출
	}

	void write() {

		try {
			Writer wr = new FileWriter("c:/temp/test2.txt");
			wr.write(65); // int매개값.
			wr.write(new char[] { 'B', 'C' });
			wr.write("DEFGHI", 2, 3);
			wr.flush();
			wr.close();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	void copy() {
		try {
			// c:/temp/sample.jpg -> c:/temp/copy.jpg 생성
			InputStream is = new FileInputStream("c:/temp/sample.jpg");
			OutputStream os = new FileOutputStream("c:/temp/copy2.jpg");

			int data = -1;
			byte[] buf = new byte[100];
			while (true) {
				// 읽기
				data = is.read(buf); // -1 반환

				os.write(buf); // 출력 (바이트 쓰기)

				if (data == -1) {
					break;
				}
			}
			is.close();
			os.flush();
			os.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// input 메서드 정의
	void input() {
		try {
			InputStream is = new FileInputStream("c:/temp/test1.dat");
			while (true) {
				int data = is.read(); // 바이트 읽고 반환 (-1 값 반환)
				System.out.println(data);
				if (data == -1)
					break;
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("end of prog");
	}

	static void input1() {
		try {
			InputStream is = new FileInputStream("c:/temp/test1.dat");
			while (true) {
				int data = is.read(); // 바이트 읽고 반환 (-1 값 반환)
				System.out.println(data);
				if (data == -1)
					break;
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("end of prog");
		// 출력스트림(바이트기반) QutputStream.
		try {
			OutputStream os = new FileOutputStream("c:/temp/test1.dat");
			os.write(10);
			os.write(20);
			os.write(30); // 쓰기
			os.flush(); // 버퍼비우기
			os.close(); // 리소스반환

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
