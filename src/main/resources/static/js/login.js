document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // 阻止表单的默认提交行为

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // 使用fetch API发送数据到服务器
    fetch('/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ username, password })
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById('message').textContent = data.message; // 显示从服务器返回的消息
        if (data.success) {
            // 登录成功后的操作，例如重定向到主页等
            window.location.href = '/home.html'; // 假设有一个home页面处理登录后的重定向
        }
    })
    .catch(error => {
        console.error('Error:', error);
        document.getElementById('message').textContent = 'An error occurred'; // 显示错误信息
    });
});
