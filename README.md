# Fragment-LifeCycle-with-Activity

### Blog 설명 : https://devhyeon0312.tistory.com/9

Directly check with LifeCycle logs from Fragment and Activity.

프래그먼트와 액티비티의 라이프사이클을 로그로 직접 확인합니다.

<img src="https://user-images.githubusercontent.com/72678200/115827139-d4d00280-a446-11eb-9148-0592781cac88.png" width="30%" height="30%">



#### 1. Test Type A 

en. Create a Fragment class, xml add fragment with <fragment> tag. 
  
kr. Fragment Class 를 생성하고, xml 에 <fragment> 를 통해서 Activity 에 삽입합니다.

#### 2. Test Type B 

en. Create a Fragment class, add ViewGroup in xml, and add fragment in code. 

kr. Fragment Class 를 생성하고, xml 에 ViewGroup 을 추가한 이후에 code 를 통해서 Fragment 를 삽입합니다.

#### 3. Test Type C

en. Check Fragment LifeCycle according to Activity LifeCycle.

kr. Activity 의 LifeCycle 에 따른 Fragment LifeCycle 을 확인합니다.

<img width="966" alt="스크린샷 2021-04-23 오후 3 16 32" src="https://user-images.githubusercontent.com/72678200/115827181-e5807880-a446-11eb-8786-1e5e50d87fc2.png">

<img width="968" alt="스크린샷 2021-04-23 오후 3 16 18" src="https://user-images.githubusercontent.com/72678200/115827159-dd283d80-a446-11eb-918f-8ced65c6e81b.png">


#### 4. Test Type D

en. When Activity is Running, insert Fragment and check LifeCycle.

kr. Activity 가 Running 상태일 때, Fragment 를 삽입하고, LifeCycle 을 확인합니다.

<img width="965" alt="스크린샷 2021-04-23 오후 3 16 48" src="https://user-images.githubusercontent.com/72678200/115827206-efa27700-a446-11eb-94e3-a3cc04b8ee93.png">

