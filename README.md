# oopCaffe
OOP Class team project. Need to make On Demand Caffe

## 개요
다음 On Demand Caffe에서 주문을 처리하는 소프트웨어를 개발하라.

커피는 추출한 커피(에스프레소)를 그대로 음용하기 보다 다른 것을 섞어 마시는 것이 일반적이다. 추출한 커피에 물을 일정량 혼합하여 마시는 카페 아메리카노와 우유를 일정량 혼합하여 마시는 카페 라떼가 가장 보편화되어 있다. 또한, 초콜릿 또는 바닐라 시럽 등을 취향에 맞춰 추가해서 마신다.

참고1. https://ko.wikipedia.org/wiki/커피

참고2. 커피의 종류

![image](http://cdnweb01.wikitree.co.kr/webdata/editor/201402/13/img_20140213160421_7a54b832.jpg)


이에 On Demand Caffe에서는 고객이 원하는 대로 다양한 커피를 제조해서 판매한다. 주문된 커피의 가격은 사용된 재료의 가격에 의해서 결정된다.

 

고객은 다음과 같이 주문할 수 있다.

"브라질 산토스 원두의 에스프레소에 인삼 시럽을 넣고 우유(steamed)로 채운 다음 휘핑 크림과 계피 가루를 올려 주세요."

그리고, 고객은 자신이 만든 커피에 이름을 붙여서 저장할 수 있으며, 다음에는 이름을 사용해서 주문할 수도 있다. 예를 들어, 앞서 주문한 커피를 "몸에 좋은 인삼 커피"라고 저장할 수 있으며, 다음번 주문에서는 "몸에 좋은 인삼 커피"에 꼬냑을 추가할 수 있다.




## 목표
시스템은 고객의 주문을 받아서 주문서(주문된 커피의 내역과 가격)를 출력해야 한다.


 
## 산출물
**산출물1. 다음 내용을 설명할 수 있는 발표 자료(PPT 등)를 제출하라.**

1) 다양한 커피(객체)를 모델링 하는 방법을 2가지 이상 설계하고, 비교/분석한 결과.

2) 프로그램의 동작을 설명하는 내용. SCREEN SHOT 포함.

3) 운영하면서 다양한 변경 요청이 있을 수 있는데, 이에 대해서 어떻게 수정하면 되는 지를 설명하는 내용. 예를 들어, 새로운 원두 / 첨가물 등의 추가, 가격 변동 등

**산출물2. 프로젝트 파일(소스 코드 포함) + 실행 파일**

 

평가 기준은 다음과 같다.

1. 커피의 모델링과 비교/분석이 적절한가(3점).

   - 검토할 만한 모델이 설계되었는가.

   - 비교/분석 기준이 명확한가. 결과가 타당한가.

2. 설계된 대로 구현되었는가(2점).

3. 프로그램이 정상적으로 동작하는가(2점).

4. 다양한 변경/확장에 용이한가(3점).

   - 원두/첨가물 등의 추가/삭제가 용이한가. 가격은.

   - 고객이 원하는 어떤 커피도 주문이 가능한가.

   - 이벤트로 특정 커피의 가격을 원래 가격의 80%로 하거나 정해진

     가격(3000원 등)으로 판매한다면 시스템을 어떻게 수정해야 하는가.
