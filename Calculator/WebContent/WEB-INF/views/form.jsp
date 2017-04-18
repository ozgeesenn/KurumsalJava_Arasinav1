<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form method="post" action="HesapMakinesi">
			Username: <input type="text" name="username"/> <br/>
			Password: <input type="password" name="password"/> <br/>
			Sayi1: <input type="text" name="sayi1"/> <br/>
			Sayi2: <input type="text" name="sayi2"/> <br/>
			
			
			KATEGORI1ISLEM: <input type="checkbox" name="operation" value="square1" />1Karesi
			<input type="checkbox" name="operation" value="square2" />2Karesi
			<input type="checkbox" name="operation" value="percent1" />1Yuzdesi
			<input type="checkbox" name="operation" value="percent2" />2Yuzdesi
			<input type="checkbox" name="operation" value="square3" />KareleriToplami
			<br/><br/>
			
			KATEGORI2ISLEM:
			<input type="radio" name="operation2" value="factoriyel1" />1Faktoriyel
			<input type="radio" name="operation2" value="factoriyel2" />2Faktoriyel
			<br/><br/>

			Feedback:<br/>
			<textarea rows="5" cols="30" name="feedback"></textarea>
			<br/><br/>
			
			IslemSec:
			<select name="islemSec">
				<option value="addition">Addition</option>
				<option value="subtraction">Subtraction</option>
				<option value="multiplication" selected>Multiplication</option>
				<option value="division">Division</option>
			</select>
						
			<br/><br/>
			<input type="submit" value="Gonder" />
			<input type="reset" value="Sil" />			
		</form>
	</div>
</body>
</html>