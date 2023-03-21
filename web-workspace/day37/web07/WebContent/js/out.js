function 로그인() {
	id2 ='root';
	id =prompt('아이디 입력')
	if (id==id2){
		alert('로그인 성공')
	} else {
		alert('로그인 실패')
	}
}

function 비교() {
	n1=100
	n2=200
	
	if(n1==n2){
		alert("동일")
	} else{
		alert("동일x")
	}
	
	f_feel=prompt('친구 기분(굿, 별로, 나빠) 입력')
	m_feel=prompt('내 기분(굿, 별로, 나빠) 입력')
	
	if(f_feel==m_feel){
		alert('동일')
	}else{
		alert('동일하지 않음')
	}
}