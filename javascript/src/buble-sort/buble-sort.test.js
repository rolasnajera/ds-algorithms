const bubleSort = (numbers) => {
  let swap = true;
  while (swap) {
    swap = false;
    for (let i = 1; i <= numbers.length; i++) {
      if (numbers[i - 1] > numbers[i]) {
        const lower = numbers[i];
        const major = numbers[i - 1];
        numbers[i] = major;
        numbers[i - 1] = lower;
        swap = true;
      }
    }
  }
  return numbers;
};

describe('buble sort test', () => {
  test('Number array test', () => {
    const array = [10, 8, 7, 9, 5, 1, 3, 2, 4, 6];
    const sorted = bubleSort(array);
    expect(sorted).toEqual([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]);
  });
});
