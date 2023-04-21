package com.multi.gazee_chatbot;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class WebSocketController {
    
    @MessageMapping("/chat2")
    @SendTo("/topic/messages2")
    public OutputMessage2 send2(Message message) { //from : guest, text:1
        System.out.println("받은 데이터>>" + message);
        OutputMessage2 out = new OutputMessage2();
        String menu = "";
        switch (message.getText()) {
            case "1":
                menu = "거래 문의입니다. 10) 사기 신고 11) 신고 접수 확인" +
                        " 12) 거래 방법 설명 13) 거래 금지 품목";
                break;
            case "2":
                menu = "배송 문의입니다. 20) 배송 조회 21) 배송 방법" +
                        " 22) 배송 일정";
                break;
            case "3":
                menu = "예치금 문의입니다. 30) 예치금 충전 31) 예치금 인출" +
                        " 32) 예치금 조회";
                break;
            case "4":
                menu = "상담원 연결 40) 채팅 연결 41) 전화 연결";
                break;
            case "10":
                menu = "신고 접수는 신고 게시판을 이용해주세요! 신고하기";
                break;
            case "11":
                menu = "이메일을 확인하세요!";
                break;
            case "12":
                menu = "1. 판매자와 채팅 2. 구매 신청 3. 거래 장소 4. 거래하기";
                break;
            case "13":
                menu = "1. 총기 및 마약류 2. 주류 3. 의약품";
                break;
            case "20":
                menu = "운송장번호로 검색하기";
                break;
            case "21":
                menu = "드론택배 준비 중..";
                break;
            case "22":
                menu = "영엽일 기준 2~5일 내 배송 될 예정이며, 도서 산간 지역의 경우 추가금이 발생 할 수 있습니다.";
                break;
            case "30":
                menu = "마이페이지 - 가지페이 - 예치금충전";
                break;
            case "31":
                menu = "마이페이지 - 가지페이 - 예치금인출";
                break;
            case "32":
                menu = "마이페이지 - 가지페이 - 예치금조회";
                break;
            case "40":
                menu = "잠시만 기다려주세요.";
                break;
            case "41":
                menu = "010-9292-4989 상담가능시간 : 평일 오전 10시 ~ 오후 6시";
                break;
            default:
                menu = "챗 봇>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
                break;
        }
        out.setMenu(menu);
        return out;
    }
    
    @MessageMapping("/chat") //채팅 내용 받을 때 사용하는 주소
    @SendTo("/topic/messages") //가입주소한 브라우저에 return message를 json으로 변환해서 보내줌.
    public OutputMessage send(Message message) {
        System.out.println("받은 데이터>>" + message);
        OutputMessage out = new OutputMessage();
        out.setFrom(message.getFrom());
        out.setText(message.getText());
        Date date = new Date();
        out.setTime(date.getHours() + ":" + date.getMinutes());
        return out;
    }
}










