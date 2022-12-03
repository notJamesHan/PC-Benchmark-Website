const emailInput = document.getElementById("emailInput");
const passwordInput = document.getElementById("passwordInput");
const loginButton = document.getElementById("loginButton");

var datas = {
  accounts: [
    {
      username: "test123",
      password: "epicgamer",
    },
    {
      username: "test124",
      password: "test124",
    },
  ],
};
loginButton.addEventListener("click", function () {
  for (const acc of datas.accounts) {
    if (
      acc.username === emailInput.value &&
      acc.password === passwordInput.value
    ) {
      window.location.replace("main.html");
      return;
    }
  }
  alert("Wrong Email or Password!");
});
