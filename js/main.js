const feed = document.getElementById("feed");
const upload = document.getElementById("upload");
const uploadButton = document.getElementById("uploadButton");
var uploadSubmitButton = document.getElementById("uploadSubmitButton");

var post = {
  post: [
    {
      title: "My Build on HL2",
      description:
        "This is my build!\nIt has a 3070, and an i7. It runs HL2 great!",
      build: {
        cpu: "intel i7",
        gpu: "3070",
        ramGB: 16,
      },
      program: "Half life 2",
      performance: 10,
    },
    {
      title: "Budget Build, Tested for GTA",
      description: "This is a budget build for GTA 5, i5 with 3050.",
      build: {
        cpu: "intel i5",
        gpu: "3050",
        ramGB: 8,
      },
      program: "GTA 5",
      performance: 6,
    },
  ],
};

function feedUpdate() {
  feed.innerHTML = "";
  for (const eachPost of post.post) {
    const newDiv = document.createElement("div");
    const title = document.createElement("h2");
    title.innerText = eachPost.title;

    const description = document.createElement("h4");
    description.innerText = eachPost.description;

    const build = document.createElement("h5");
    build.innerText = `CPU: ${eachPost.build.cpu} GPU: ${eachPost.build.gpu} RAM GB: ${eachPost.build.ramGB}`;

    const program = document.createElement("p");
    program.innerText = `Program: ${eachPost.program}`;

    const performance = document.createElement("p");
    performance.innerText = `Performance: ${eachPost.performance}`;

    newDiv.appendChild(title);
    newDiv.appendChild(description);
    newDiv.appendChild(build);
    newDiv.appendChild(program);
    newDiv.appendChild(performance);

    feed.appendChild(newDiv);
    newDiv.classList.add("eachFeed");
  }
}

uploadButton.addEventListener("click", function () {
  const newDiv = document.createElement("div");
  const title = document.createElement("input");
  title.placeholder = "Title";
  title.id = "title";

  const description = document.createElement("input");
  description.placeholder = "Description";
  description.id = "description";

  const cpu = document.createElement("input");
  const gpu = document.createElement("input");
  const ramGB = document.createElement("input");
  cpu.placeholder = "CPU Name";
  gpu.placeholder = "GPU Name";
  ramGB.placeholder = "RAM GigaByte";
  cpu.id = "cpu";
  gpu.id = "gpu";
  ramGB.id = "ramGB";

  const program = document.createElement("input");
  program.placeholder = "Program Used";
  program.id = "program";

  const performance = document.createElement("input");
  performance.placeholder = "Performance - 1/10";
  performance.id = "performance";

  const submitBtn = document.createElement("button");
  submitBtn.textContent = "Upload";
  submitBtn.id = "uploadSubmitButton";

  newDiv.appendChild(title);
  newDiv.appendChild(description);
  newDiv.appendChild(cpu);
  newDiv.appendChild(gpu);
  newDiv.appendChild(ramGB);
  newDiv.appendChild(program);
  newDiv.appendChild(performance);
  newDiv.appendChild(submitBtn);

  upload.appendChild(newDiv);
  newDiv.classList.add("uploadDiv");

  uploadSubmitButton = document.getElementById("uploadSubmitButton");

  uploadSubmitButton.addEventListener("click", function () {
    const title = document.getElementById("title");
    const description = document.getElementById("description");
    const cpu = document.getElementById("cpu");
    const gpu = document.getElementById("gpu");
    const ramGB = document.getElementById("ramGB");
    const program = document.getElementById("program");
    const performance = document.getElementById("performance");

    post.post.push({
      title: title.value,
      description: description.value,
      build: {
        cpu: cpu.value,
        gpu: gpu.value,
        ramGB: ramGB.value,
      },
      program: program.value,
      performance: performance.value,
    });

    feedUpdate();

    upload.innerHTML = "";
  });
});

feedUpdate();
