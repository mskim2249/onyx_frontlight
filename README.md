# onyx_frontlight

Onyx 기기에서 key mapper 어플로 화면 밝기(front light)를 조절할 수 있게 해줌

# Usage

## 방법1

어플 설치 후

Key mapper -> Actions -> Add action -> Launch app shortcut -> Increase display brightness 혹은 Decrease display brightness

## 방법2

어플 설치 후

Key mapper -> Actions -> Add action -> Send Intent


 - Description : Increase brightness

 - Broadcast receiver 선택

 - Action : increase

 - Flags : 32

 - Package : com.onyxtest.frontlight
