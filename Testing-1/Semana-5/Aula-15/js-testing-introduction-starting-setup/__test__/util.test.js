const { generateText } = require('../util.js')


describe('Provas de saída de dados', ()=>{
    test('Saída com dados', ()=>{
        const text = generateText('Daniel', 30);
        expect(text).toBe('Daniel (30 years old)');
        const text2 = generateText('Washington', 26);
        expect(text2).toBe('Washington (26 years old)');
    });
    it ('Saída com dados vazios', ()=>{
        const text = generateText('', null);
        expect(text).toBe(' (null years old)');
    });
    test('Saída sem dados', ()=>{
        const text = generateText();
        expect(text).toBe('undefined (undefined years old)');
    });
    
});