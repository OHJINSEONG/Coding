
const arr = s.split(' ');
return arr.map((element) => element.split(''))
    .map((e) => e.map((em, i) => (i % 2 === 0 ? em.toUpperCase() : em.toLowerCase()))
      .reduce((acc, crr) => acc + crr,'')).reduce((acc, crr) => `${acc} ${crr}`);
}
