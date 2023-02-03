# onyx_frontlight

Onyx 기기에서 key mapper 어플로 화면 밝기(front light)를 조절할 수 있게 해줌

## Usage

<https://github.com/mskim2249/onyx_frontlight/releases/download/v1.0/onyx_frontlight.apk>

위 링크로 APK 파일 다운로드 후 오닉스 기기에 설치

### 방법1

어플 설치 후

Key mapper -> Actions -> Add action -> Launch app shortcut -> Increase display brightness 혹은 Decrease display brightness

### 방법2

어플 설치 후

Key mapper -> Actions -> Add action -> Send Intent


 - Description : Increase brightness

 - Broadcast receiver 선택

 - Action : increase

 - Flags : 32

 - Package : com.onyxtest.frontlight

## Uninstall

홈 화면의 상단 우측 아이콘 -> 애플리케이션 -> 앱 관리 -> Front Light 선택 -> 설치 제거

