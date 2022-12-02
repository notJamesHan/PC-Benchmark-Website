const emailInput = document.getElementById("emailInput");
const passwordInput = document.getElementById("passwordInput");
const loginButton = document.getElementById("loginButton");

var datas = {
  accounts: [
    {
      username: "test123",
      password: "test123",
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
      console.log("epic");
      alert("Correct!");
      window.location.replace("main.html");
      return;
    }
  }
  alert("Wrong Email or Password!");
});
