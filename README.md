> # 온담 프로젝트 설명
> **배포 주소: http://223.130.151.54/** <br/> **개발기간: 2025.03.27 ~ 2025.04.16**<br/>
> '온(모두)'과 '담(담다)'이 결합된 이름으로 모든 구성원미 함께 소통하고 협업할 수 있는 공간을 의미
> >1.업무 소통의 불편함을 해소하고 협업의 효율성을 높이는 것을 목표<br/>
> >2.부서 간 경계를 허물고, 자뮤흡고 투명한 커뮤니케이션을 지원<br/>
> >3. 업무 생산성 향상, 팀워크 증진, 더나은 조직 문화를 기대<br/>

> ## 팀원 소개
- 전종원(팀장)
- 김녹엽
- 김동휘
- 김준호
- 박수진
- 오하늬

> ## Stacks
>### Environment
>![SPRINGBOOT](https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
>![THYMLEAF](https://img.shields.io/badge/thymleaf-005F0F?style=for-the-badge&logo=thymlef&logoColor=white)
>![GIT](https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white)
>![GTIHUB](https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white)

>### Development
>![HTML5](https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
>![CSS3](https://img.shields.io/badge/css3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
>![JAVASCRIPT](https://img.shields.io/badge/javascipt-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white)
>![JAVA](https://img.shields.io/badge/java-FF7800?style=for-the-badge&logo=java&logoColor=white)
>![BOOTSTRAP](https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white)
>![JQUERY](https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=white)

>### DB
>![MYSQL](https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

>### CI/CD
>![JENKINS](https://img.shields.io/badge/jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white)
>![DOCKER](https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

>### 사용한 API 및 서비스
>| API/서비스 | 목적 및 기능 |
>|------|------|
>| FullCalendar API | 달력 UI를 통해 일정목록 확인 |
>| OpenWeather API | 메인 화면에서 날씨 정보 제공 |
>| SSE | 결제, 쪽지, 일정 등록 시 실시간 알림 전송 |
>| WebSocket | 실시간 채팅 및 채팅 도착 알림 기능 구현 |

> ## 프로젝트 기능 구현
> ### 전종원
> - 인사관리
>   - 관리자가 사용자 인적사항 입력하여 아이디 생성
>   - 사용자에게 메일로 아이디/비밀번호 전송
>   - 부서별 인적사항 목록 및 상세 보기
>   - 관리자만 인적사항 수정/삭제 가능
>   - 퇴사자 목록은 관리자만 열람 가능, 삭제 시 DB에서도 제거
> - 부서 관리
>   - 부서 목록 출력
>   - 관리자만 부서/팀 등록,수정,삭제 가능
> - 로그인
>   - 사용자 로그인 기능
>   - 관리자ID, 직원 ID 분리
> - 전자 결재
>    - 관리자가 템플릿 및 결재라인 생성
>    - 결재라인 순서 지정 가능, 조직원 검색 후 추가
>    - 기안자는 템플릿 선택 시 내용/결재자 자동 불러오기
>    - 제목, 내용, 파일 첨부 후 결재 기안
>    - 결재자는 순서대로 승인 가능
>    - 최종 승인 시 상태 ‘승인’, 반려 시 ‘반려’로 변경
>    - 기안자는 결재 전이면 회수 가능
>    - 첫 결재자 및 다음 차례자에게 알림 발송
>    - 최종 승인/반려 시 기안자에게 알림 발송
>    - 내 기안 문서 목록 확인 가능
>    - 완료, 진행중, 결재중 문서 구분 출력
>    - 템플릿 제목, 기안자명으로 검색 가능
>    - 결재 상세보기 및 파일 다운로드 가능
> ### 김녹엽
> - 메신저
>    - 1:1, 그룹 채팅 기능
>    - 그룹 생성 시 한 명 이상 초대 필수
>    - 이름 미입력 시 생성자 이름으로 자동 설정
>    - 멤버가 모두 나가면 그룹 자동 삭제
>    - 채팅 발생 시 모든 멤버에게 알림 전송
>    - 파일 전송 기능 지원
>    - 실시간 알림 제공
> ### 김동휘
> - 게시판
>   - 공지사항, 일반, 익명, 부서별 게시판 제공
>   - 공지사항은 관리자만 등록, 직원은 조회만 가능
>   - 일반 게시판은 모든 직원이 작성 가능
>   - 익명 게시판은 익명으로 작성 가능
>   - 부서 게시판은 해당 부서 인원만 작성 가능
>   - 게시글 상세보기 가능
> ### 김준호
> - 자료실
>    - 부서별 자료 공유 기능 제공
>    - 4개 이상 파일은 zip으로 일괄 다운로드
>    - 파일 업로드 및 다운로드 가능
> - 쪽지
>    - 직원 선택 후 쪽지 전송 가능
>    - 수신자에게 알림 자동 생성
>    - 중요 메세지는 별도 표시 및 필터링 가능
>    - 제목/내용 기준으로 보낸·받은 쪽지 검색 가능
> ### 박수진
> - 일정관리
>    - 개인/그룹 일정으로 구분
>    - 직원 등록 시 회사/부서 일정 자동 등록, 개인일정 그룹 생성
>    - 부서 생성 시 부서 일정 그룹 자동 생성
>    - 일정 그룹 생성 및 멤버 초대 가능
>    - 오늘 기준 전체 일정 출력
>    - 부서/회사/개인/그룹 일정은 색상으로 구분
>    - 일정 작성자 또는 관리자만 일정 수정/삭제 가능
>    - 그룹별 일정 필터링
>    - 그룹 멤버만 해당 그룹 일정 열람 가능
>    - 그룹 일정 추가 시 멤버 전체 알림 전송
>    - 일정 상세보기, 수정, 삭제 가능
> - 알림
>    - SCHEDULE, SYSTEM, MESSAGE, APPROVAL 타입별 확인 가능
>    - 실시간 알림 수신
>    - 전체 확인 시 알림 헤더에서 표시 사라짐
>    - 클릭 시 해당 타입 페이지로 이동
> ### 오하늬
> - UI/UX
>    - 전체 화면 UI 구성 담당
>    - 메인에 공지사항, 전자결재, 일정, 날씨 노출
> - 마이페이지
>    - 내 정보 조회
>    - 비밀번호, 연락처, 주소 수정 가능
