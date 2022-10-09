## 좌표계산기

### 기능 요구사항
* 좌표 계산기 - 선 길이
  * 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
  * 좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
  * X, Y좌표 모두 최대 24까지만 입력할 수 있다.
  * 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
  * 정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.
  * 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
  * 직선인 경우는 두 점 사이 거리를 계산해서 출력한다.
  * 실행 결과
    ```text
    좌표를 입력하세요.
    (10,10)-(14,15)
    ```
### 기능 목록
- [X] 객체 생성
    - [X] 좌표 객체 생성
        - [X] 좌표 값 범위(0 ~ 24) 검증
    - [X] 계산기 인터페이스 생성
    - [X] 계산기 팩토리 생성
    - [X] 직선 거리 계산 구현체 생성
- [ ] 입력
    - [ ] `-`를 기준으로 문자열 분리
    - [ ] `(`,`)` 사이의 숫자 분리
- [ ] 출력
    - [ ] 두 점 사이 거리 출력
- [ ] 게임 진행 & 종료
    - [ ] 입력 범위 초과 시 재입력