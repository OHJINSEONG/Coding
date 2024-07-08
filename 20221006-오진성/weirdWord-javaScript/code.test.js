/* eslint-disable no-undef */
import main, { map, mapToMap, reduce } from './code';

// test('', () => {
//   expect(main('try hello world')).toEqaul('TrY HeLlO WoRlD');
// });

test('', () => {
  expect(main('try hello world')).toBe('TrY HeLlO WoRlD');
});

test('', () => {
  expect(main('tryewr helloq world')).toBe('TrYeWr HeLlOq WoRlD');
});

test('', () => {
  expect(main('')).toBe('');
});
