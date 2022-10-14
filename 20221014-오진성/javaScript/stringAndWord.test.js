/* eslint-disable no-undef */
import stringToEnglish from './stringAndWord';

test('stringToEnglish', () => {
  expect(stringToEnglish('one4seveneight')).toStrictEqual(1478);
});

test('stringToEnglish', () => {
  expect(stringToEnglish('oneone')).toStrictEqual(11);
});
