const emailInput = document.querySelector("#emailInput");
const passwordInput = document.querySelector("#passwordInput");

const loginButton = document.querySelector("#loginButton");

var login = "";
var passoword = "";

loginButton.addEventListener("click", function () {
  console.log(emailInput);
  console.log(passwordInput);
  if (emailInput.value === "test123") {
    console.log("epic");
  } else {
    alert("Wrong Email or Password!");
  }
});
