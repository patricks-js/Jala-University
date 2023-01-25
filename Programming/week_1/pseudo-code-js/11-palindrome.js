// Flowchart: https://www.figma.com/file/wKwhNHb9FogcXEOd7g29uy/Untitled?node-id=0%3A1&t=HBKooLQyWYrUiVdI-1

const word = "matam";
let auxWord = "";

function isPalindrome(word) {
  for (let i = 0; i < word.length; i++) {
    if (word[i] === word[word.length - i - 1]) {
      auxWord += word[i];
    }
  }

  if (word === auxWord) {
    return `The word ${word} is a palindrome!`;
  }

  return `The word ${word} is not a palindrome!`;
}

console.log(isPalindrome(word));
