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
>   - 관리자가 사용자의 인적사항을 기입하고 아이디 생성 됨
>   - 사용자가 생성되며 기입된 메일 주소로 아이디와 비밀번호 전송
>   - 부서별로 직원 인적사항 리스트 출력 및 인적사항 상세보기 기능
>   - 인적사항은 관리자만 수정, 삭제 가능
>   - 퇴사자 리스트는 관리자만 볼 수 있고 퇴사자 목록에서 삭제 시 DB에서도 삭제됨
> - 부서 관리
>   - 부서 목록 출력
>   - 관리자만 부서/팀 등록,수정,삭제 가능
> - 로그인
> - 전자 결재
>    - 관리자가 템플릿 및 결제 라인 생성
>    - 결제라인은 제한없이 순서 지정 가능하고 조직원 검색 및 선택 할 수 있음
>    - 기안자가 템플릿을 선택하면 내용, 결재자 목록을 불러옴
>    - 제목, 내용, 파일 첨부해서 결재 기안
>    - 결재자애 등록된 순서대로 결재 승인 가능
>    - 최종 승인 후 상태가 '승인'으로 변경
>    - 반려 사유를 작성하고 상태 '반려'로 변경
>    - 기안자는 결재자 중 아무도 결재하지 않은 경우 회수 가능
>    - 결재가 생성되면 첫 결재자한테 알림 발송, 본인의 차례가 되면 알림 발송
>    - 최종 승인 혹은 반려 시 기안자에게 알림 생성
>    - 기안을 올린 목록 확인 가능
>    - 완료된 문서, 진행중인 문서, 결재 중인 문서 따로 목록 출력
>    - 템플릿 제목과 기안자명으로 검색 가능
>    - 결재 상세보기 기능(파일 다운로드)
