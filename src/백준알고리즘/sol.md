    선행스킬이란 어떤 스킬을 배우기 전에 먼저 배워야하는 스킬을 뜻합니다.
예를 들어 선행 스킬 순서가 스파크 라이트닝 볼트 썬더 일때 썬더를 배우려먼 먼저 라이트닝 볼트를 배워야하고 라이트닝 볼트를 배우려면 먼저 스파크를 배워야합니다.

위순서에있는 다른 스킬은 순서에 상관없이 배울 수 있습니다. 따라서 스파크 -> 힐링 -> 라이트닝 볼트 썬더와 같은 스킬트리는 가능하지만 썬더 -> 스파크나
라이트닝 볼트 -> 스파크-> 힐링->썬더와 같은 스킬트리는 불가능합니다.
선행 스킬 순서 스킬과 유저들이 만든 스킬트리를 담은 배열 skill_trees가 매개변수로 주어질 때 가능한 스킬트리 개수를 return하는 solution 함수를 작서앻쥇요



제한 조건 
스킬은 알파벳 대문자로 표기하며 모든 문자열은 알파벳 대문자로만 이루어져있다. 
스킬 순서와 스킬트리는 문자열로 표기합니다 .
예를 들어 C->B-> D 면 
"CBD" 로표기합니다. 
선해 스킬 순서가 skill의 길이는 1이상 26이하이며 스킬은 중복해 주어지지 않습니다. 
skill_trees의 원소는 길이가 2이상 26이화인 문자열이며, 스킬이 중복해주어지지 않습니다. 


입출력 예 설명 

BACDE : B 스킬을 배우기전에 Ctㅡ킬을 먼저 배워야합니다 불가능한 스킬트리입니다 .
CBADF가능한 스킬트리입니다.
AECB: 가능한 스킬트리 
BDA : B스킬을 배우기전에 C스킬을 먼저 배워야합니다. 불가능 한 스킬트리 입니다. 
