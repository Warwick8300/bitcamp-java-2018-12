

// 헤더 가져오기
(function () {
  var header = document.querySelector('.bit-main-header');
  var xhr = new XMLHttpRequest()
  xhr.onreadystatechange = function() {
    if (xhr.readyState != 4 || xhr.status != 200)
      return;
    header.innerHTML = xhr.responseText
    
    // body 태그 쪽에 헤더 로딩 완료 이벤트를 보낸다.
    var e = new Event('loaded.header');
    document.body.dispatchEvent(e);
  };
  xhr.open('GET', '/java-web-project/html/header.html', true);
  xhr.send();
})();

// 
// header.html 이 삽입 되지도 않았는데 로그아웃 버튼을 아서는 안된다.

document.body.addEventListener('loaded.header', () =>{
  var loginState = document.querySelector('#bit-login-state'),
  notLoginState = document.querySelector('#bit-not-login-state');


  
document.querySelector('#logout-menu').addEventListener('click',(e)=>{
  e.preventDefault();
  var xhr = new XMLHttpRequest()
  xhr.onreadystatechange = function() {
    if (xhr.readyState != 4 || xhr.status != 200)
      return;
    
    // body 태그 쪽에 헤더 로딩 완료 이벤트를 보낸다.
    location.href = '/java-web-project/html/index.html';
  };
  xhr.open('GET', '/java-web-project/app/json/auth/logout', true);
  xhr.send();
});
});

//로그인 정보를 받아온다.
(function() {
  //서버에서 로그인 한 사용자 정보를 가져온다
  var xhr = new XMLHttpRequest()
  xhr.onreadystatechange = function() {
    if (xhr.readyState != 4 || xhr.status != 200)
      return;
    
    var data = JSON.parse(xhr.responseText);
    if(data.status == 'success'){
      document.querySelector('#bit-login-state').className.replace('bit-invisible', '');
      document.querySelector('#login-username').innerHTML = data.user.name;
      document.querySelector('#login-userphoto').src ="/java-web-project/upload/member/" + data.user.name;
    }else {
      document.querySelector('#bit-not-login-state').className.replace('bit-invisible', '');
      
    }
    
    //location.href = '/java-web-project/html/index.html';
  };
  xhr.open('GET', '/java-web-project/app/json/auth/user', true);
  xhr.send();
  
  
})();