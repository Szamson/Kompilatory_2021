from setuptools import setup, find_packages

setup(
    name="HeroLang",
    version="1.2",
    install_requires=[
        "antlr4-python3-runtime>=4.9.2",
        "pygame>=2.0.1",
        "numpy>=1.19.2"
    ],

    packages=['HeroLang'],
    entry_points={
        'console_scripts': [
            'HeroLang = HeroLang.antlr:main',
        ],
    }
)
